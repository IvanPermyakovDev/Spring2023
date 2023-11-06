package infrastructure.specifications;

import application.entities.User;

public interface UserSpecification {
    boolean fits(User user);
}
