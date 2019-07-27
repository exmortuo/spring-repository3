package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.repository.OrderRepository;
import pl.dominisz.springintroduction.repository.UserRepository;
import pl.dominisz.springintroduction.exception.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;
  private final UserRepository userRepository;

  public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository) {
    this.orderRepository = orderRepository;
    this.userRepository = userRepository;
  }

  @Override
  public Order createOrderForUser(long id, Order order) {
    Optional<User> optionalUser = userRepository.findById(id);

    User user = optionalUser.orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found!"));

    order.setUser(user);
    return orderRepository.save(order);
  }

  @Override
  public Order createOrderWithoutUser(Order order) {
    return null;
  }

  @Override
  public List<Order> findOrdersForUser(long userId) {

    if(!userRepository.existsById(userId)){
      throw new EntityNotFoundException("User with id " + userId + " not found");
    }

    return orderRepository.findByUserId(userId);
  }
}
