package infrastructure.specifications;

import infrastructure.entities.User;

public interface UserSpecification {
    boolean fits(User userImpl);
}
