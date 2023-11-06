package infrastructure.specifications;

import infrastructure.entities.UserImpl;

public interface UserSpecification {
    boolean fits(UserImpl userImpl);
}
