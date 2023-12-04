package infrastructure.DTOs;

import domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class ProjectDTO {
    private long id;
    private String name;
    private String description;
    private User teamLead;
    private List<Long> teamMembers;
    private List<String> taskCategories;
}
