package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.CreateUserDto;
import pl.dominisz.springintroduction.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public User createUser(CreateUserDto user) {
    return new User();
  }

  @Override
  public Optional<User> findUser(long id) {
    return Optional.empty();
  }

  @Override
  public List<User> findUsers() {
    return null;
  }
}
