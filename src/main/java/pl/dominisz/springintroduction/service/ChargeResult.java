package pl.dominisz.springintroduction.service;

public class ChargeResult {

  private boolean successful;
  private String declinedMessage;

  public ChargeResult(boolean successful, String declinedMessage) {
    this.successful = successful;
    this.declinedMessage = declinedMessage;
  }

  public boolean isSuccessful() {
    return successful;
  }

  public String getDeclineMessage() {
    return declinedMessage;
  }
}
