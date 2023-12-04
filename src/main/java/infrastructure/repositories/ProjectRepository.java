package infrastructure.repositories;

import domain.model.User;
import infrastructure.entities.Project;
import infrastructure.specifications.ProjectSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAll();
    List<Project> findByTeamLead(User teamLead);
    List<Project> find(ProjectSpecification specification);
}
