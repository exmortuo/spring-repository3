package pl.dominisz.springintroduction.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.service.OrderService;

@RestController
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping("/users/{id}/orders")
  public ResponseEntity<Order> createOrderForUser(@PathVariable long id, @RequestBody Order order) {
    return ResponseEntity.ok(orderService.createOrderForUser(id, order));
  }

  @PostMapping("/orders")
  public ResponseEntity<Order> createOrderWithoutUser(@RequestBody Order order) {
    return ResponseEntity.ok(orderService.createOrderWithoutUser(order));
  }
}
