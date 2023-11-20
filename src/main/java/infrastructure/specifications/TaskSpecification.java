package infrastructure.specifications;

import infrastructure.entities.Task;

public interface TaskSpecification {
    boolean fits(Task taskImpl);
}