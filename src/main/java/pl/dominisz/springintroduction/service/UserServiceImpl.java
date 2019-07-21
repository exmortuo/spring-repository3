package pl.dominisz.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.converter.Converter;
import pl.dominisz.springintroduction.model.CreateUserDto;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final Converter<User, CreateUserDto> userCreateUserDtoConverter;
  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(
      Converter<User, CreateUserDto> userCreateUserDtoConverter, UserRepository userRepository) {
    this.userCreateUserDtoConverter = userCreateUserDtoConverter;
    this.userRepository = userRepository;
  }

  @Override
  public User createUser(CreateUserDto createUserDto) {
    User user = userCreateUserDtoConverter.toModel(createUserDto);
    user = userRepository.save(user);
    return user;
  }

  @Override
  public Optional<User> findUser(long id) {
    return userRepository.findById(id);
  }

  @Override
  public List<User> findUsers() {
    return userRepository.findAll();
  }
}
