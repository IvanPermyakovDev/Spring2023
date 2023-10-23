package infrastructure.repositories;

import application.entities.Project;
import domain.model.User;
import infrastructure.specifications.ProjectSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    void add(Project project);
    void update(Project project);
    void delete(Project project);
    Project findById(long id);
    ArrayList<Project> findByTeamLead(User teamLead);
    ArrayList<Project> find(ProjectSpecification specification);
}
