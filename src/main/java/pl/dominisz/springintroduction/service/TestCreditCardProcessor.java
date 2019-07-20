package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

public class TestCreditCardProcessor implements CreditCardProcessor {
  @Override
  public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
    return new ChargeResult(true, "");
  }
}
