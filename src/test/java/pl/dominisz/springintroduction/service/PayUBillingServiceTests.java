package pl.dominisz.springintroduction.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PayUBillingServiceTests {

  @Test
  public void shouldCreateSuccessfulReceipt() {
    Order order = new Order(BigDecimal.TEN);
    CreditCard creditCard = new CreditCard("123456", "owner", "123", 1, 2020);

    CreditCardProcessor creditCardProcessor = new PayUCreditCardProcessor();
    TransactionLog transactionLog = new DatabaseTransactionLog();
    PayUBillingService payUBillingService =
        new PayUBillingService(creditCardProcessor, transactionLog);

    Receipt receipt = payUBillingService.chargeOrder(order, creditCard);

    Assertions.assertTrue(receipt.isSuccessfull());
    Assertions.assertEquals(receipt.getAmount(), BigDecimal.TEN);
  }
}
