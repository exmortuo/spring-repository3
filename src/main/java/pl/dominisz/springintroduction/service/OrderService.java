package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.Order;

public interface OrderService {
  Order createOrderForUser(long id, Order order);

  Order createOrderWithoutUser(Order order);
}
