package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

public class Order {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
