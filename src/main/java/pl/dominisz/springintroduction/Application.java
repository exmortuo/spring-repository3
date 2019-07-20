package pl.dominisz.springintroduction;

import pl.dominisz.springintroduction.service.*;

import java.math.BigDecimal;

public class Application {

  public static void main(String[] args) {

    BillingService billingService = new PayUBillingService();

    Order order = new Order(BigDecimal.TEN);
    CreditCard creditCard = new CreditCard("123456", "holder", "123", 1, 2020);

    Receipt receipt = billingService.chargeOrder(order, creditCard);

    System.out.println(receipt);
  }
}
