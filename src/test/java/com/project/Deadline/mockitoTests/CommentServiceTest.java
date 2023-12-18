package com.project.Deadline.mockitoTests;


import com.project.Deadline.infrastructure.DTOs.CommentDTO;
import com.project.Deadline.infrastructure.entities.Comment;
import com.project.Deadline.infrastructure.repositories.CommentRepository;
import com.project.Deadline.services.business.Impl.CommentService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static jdk.jfr.internal.jfc.model.Constraint.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CommentServiceTest {
    @Mock
    private CommentRepository commentRepositoryMock;

    @InjectMocks
    private CommentService commentService;

    @Test
    public void testCreate() {
        CommentDTO commentDTO = new CommentDTO(1, 1, "my comment");
        when(commentRepositoryMock.save(any(Comment.class))).thenReturn(new Comment(1, 1, "my comment"));

        commentService.create(commentDTO);

        verify(commentRepositoryMock, times(1)).save(any(Comment.class));
    }

    @Test
    public void testFindByUser() {
        List<Comment> comments = Arrays.asList(new Comment(1, 1, "my comment"), new Comment(2, 1, "my comment 2"));
        when(commentRepositoryMock.findByUser(1L)).thenReturn(comments);

        List<CommentDTO> result = commentService.findByUser(1L);

        assertEquals(2, result.size());
        assertEquals("my comment", result.get(0).getText());
        assertEquals("my comment 2", result.get(1).getText());
    }

    @Test
    public void testChange() {
        Comment comment = new Comment(1, 1, "Hello");
        when(commentRepositoryMock.findById(1L)).thenReturn(Optional.of(comment));

        commentService.change(1L, "New text");

        verify(commentRepositoryMock, times(1)).save(any(Comment.class));
        assertEquals("New text", comment.getText());
    }

    @Test
    public void testDelete() {
        doNothing().when(commentRepositoryMock).deleteById(1L);

        commentService.delete(1L);

        verify(commentRepositoryMock, times(1)).deleteById(1L);
    }
}
