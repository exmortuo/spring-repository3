package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.converter.Converter;
import pl.dominisz.springintroduction.model.CreateUserDto;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.model.UserDto;
import pl.dominisz.springintroduction.service.UserService;

import java.util.List;

@RestController
public class UserController {

  private final UserService userService;
  private final Converter<User, UserDto> userUserDtoConverter;

  @Autowired
  public UserController(UserService userService, Converter<User, UserDto> userUserDtoConverter) {
    this.userService = userService;
    this.userUserDtoConverter = userUserDtoConverter;
  }

  @PostMapping("/users")
  public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto user) {
    return ResponseEntity.ok(userUserDtoConverter.toDto(userService.createUser(user)));
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<UserDto> findUser(@PathVariable long id) {
    return ResponseEntity.of(
        userService.findUser(id).map(user -> userUserDtoConverter.toDto(user)));
  }

  @GetMapping("/users")
  public List<User> findUsers() {
    return userService.findUsers();
  }
}
