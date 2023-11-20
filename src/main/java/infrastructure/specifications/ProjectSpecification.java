package infrastructure.specifications;

import infrastructure.entities.Project;

public interface ProjectSpecification {
    boolean fits(Project projectImpl);
}
