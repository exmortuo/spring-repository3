package pl.dominisz.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.model.CreateUserDto;
import pl.dominisz.springintroduction.model.User;

@Component
public class UserCreateUserDtoConverter implements Converter<User, CreateUserDto> {
  @Override
  public User toModel(CreateUserDto dto) {
    User model = new User();

    model.setFirstName(dto.getFirstName());
    model.setLastName(dto.getLastName());
    model.setEmail(dto.getEmail());
    model.setAddress(dto.getAddress());
    model.setPassword(dto.getPassword());
    model.setCreditCard(dto.getCreditCard());

    return model;
  }

  @Override
  public CreateUserDto toDto(User model) {
    return null;
  }
}
