package pl.dominisz.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.model.UserDto;

@Component
public class UserUserDtoConverter implements Converter<User, UserDto> {
  @Override
  public User toModel(UserDto dto) {
    return null;
  }

  @Override
  public UserDto toDto(User model) {
    UserDto dto = new UserDto();

    dto.setId(model.getId());
    dto.setFirstName(model.getFirstName());
    dto.setLastName(model.getLastName());
    dto.setEmail(model.getEmail());
    dto.setAddress(model.getAddress());

    return dto;
  }
}
