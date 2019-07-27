package pl.dominisz.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

  private List<Order> orders = new ArrayList<>();
  private long index = 1;

  @Override
  public Order save(Order order) {
    orders.add(order);
    order.setId(index);
    index++;
    return order;
  }

  @Override
  public List<Order> findByUserId(long userId) {
    return orders
            .stream()
            .filter(order -> order
                    .getUser()
                    .getId() == userId)
            .collect(Collectors
                    .toList());
  }
}
