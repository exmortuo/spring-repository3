package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.Order;

@Service
public class OrderServiceImpl implements OrderService {
  @Override
  public Order createOrderForUser(long id, Order order) {
    return null;
  }

  @Override
  public Order createOrderWithoutUser(Order order) {
    return null;
  }
}
