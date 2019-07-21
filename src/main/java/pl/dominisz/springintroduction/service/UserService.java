package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.CreateUserDto;
import pl.dominisz.springintroduction.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  User createUser(CreateUserDto user);

  Optional<User> findUser(long id);

  List<User> findUsers();
}
