package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;

@Component
public class DatabaseTransactionLog implements TransactionLog {
  @Override
  public void logChargeResult(ChargeResult result) {}

  @Override
  public void logConnectException(UnreachableException exception) {}
}
