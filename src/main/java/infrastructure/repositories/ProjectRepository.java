package infrastructure.repositories;

import domain.model.User;
import infrastructure.entities.Project;
import infrastructure.specifications.ProjectSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    void add(Project projectImpl);
    void update(Project projectImpl);
    void delete(Project projectImpl);
    Project findById(long id);
    List<Project> findAll();
    List<Project> findByTeamLead(User teamLead);
    List<Project> find(ProjectSpecification specification);
}
