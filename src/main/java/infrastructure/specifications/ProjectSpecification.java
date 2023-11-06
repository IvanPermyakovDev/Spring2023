package infrastructure.specifications;

import infrastructure.entities.ProjectImpl;

public interface ProjectSpecification {
    boolean fits(ProjectImpl projectImpl);
}
