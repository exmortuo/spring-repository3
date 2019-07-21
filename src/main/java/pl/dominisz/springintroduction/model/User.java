package pl.dominisz.springintroduction.model;

import lombok.Data;

@Data
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private CreditCard creditCard;

}
