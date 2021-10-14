package BestGymEver;

import java.time.LocalDate;

public class Customer {
    String name ;
    String socialSecurityNumber ;
    LocalDate paymentDate ;

    public Customer(String socialSecurityNumber, String name , LocalDate paymentDate) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.paymentDate = paymentDate;
    }

    public String getName() {
        return name ;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber ;
    }

    public LocalDate getPaymentDate() {
        return paymentDate ;
    }

}
