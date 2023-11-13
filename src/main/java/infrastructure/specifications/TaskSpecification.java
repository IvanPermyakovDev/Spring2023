package infrastructure.specifications;

import infrastructure.entities.TaskImpl;

public interface TaskSpecification {
    boolean fits(TaskImpl taskImpl);
}