package infrastructure.specifications;

import application.entities.Project;

public interface ProjectSpecification {
    boolean fits(Project project);
}
