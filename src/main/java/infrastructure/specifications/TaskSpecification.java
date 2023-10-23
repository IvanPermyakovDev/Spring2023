package infrastructure.specifications;

import application.entities.Task;

public interface TaskSpecification {
    boolean fits(Task task);
}