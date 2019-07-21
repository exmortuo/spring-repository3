package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.service.UserService;

import java.util.List;

@RestController
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/users")
  public void createUser(@RequestBody User user) {
    userService.createUser(user);
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<User> findUser(@PathVariable long id) {
    return ResponseEntity.of(userService.findUser(id));
    // to jest równoważne poniższemu
    //        Optional<User> optionalUser = userService.findUser(id);
    //        if (optionalUser.isPresent()) {
    //            return ResponseEntity.ok(optionalUser.get());
    //        } else {
    //            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //        }
  }

  @GetMapping("/users")
  public List<User> findUsers() {
    return userService.findUsers();
  }
}
