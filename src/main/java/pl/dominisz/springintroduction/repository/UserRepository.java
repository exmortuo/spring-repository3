package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.User;

public interface UserRepository {
    User save(User user);
}
