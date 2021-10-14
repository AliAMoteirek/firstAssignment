package BestGymEver.logicutil;

import BestGymEver.Customer;

import java.time.LocalDate;

public class Membership {

    public boolean hasMembershipExpired (Customer customer) {
        return (customer.getPaymentDate().isBefore(LocalDate.now().minusYears(1))) ;
    }

}
