package infrastructure.repositories;

import infrastructure.entities.ProjectImpl;
import domain.model.User;
import infrastructure.specifications.ProjectSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectImpl, Long> {
    void add(ProjectImpl projectImpl);
    void update(ProjectImpl projectImpl);
    void delete(ProjectImpl projectImpl);
    ProjectImpl findById(long id);
    ArrayList<ProjectImpl> findAll();
    ArrayList<ProjectImpl> findByTeamLead(User teamLead);
    ArrayList<ProjectImpl> find(ProjectSpecification specification);
}
