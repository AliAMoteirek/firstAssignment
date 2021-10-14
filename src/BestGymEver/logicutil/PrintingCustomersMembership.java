package BestGymEver.logicutil;

import BestGymEver.Customer;

public class PrintingCustomersMembership {

    protected boolean condition = false ;
    Membership m = new Membership() ;

    public boolean printCustomerMembership (Customer existingCustomer) {
        if (existingCustomer != null) {
            if (m.hasMembershipExpired(existingCustomer)) {
                String message = "Hey " + existingCustomer.getName() + ", sorry your membership has expired!" ;
                System.out.println(message);
                return condition;
            } else {
                String message = "Hey "+ existingCustomer.getName() +", welcome to The Best Gym Ever! We hope " +
                        "you have a nice workout!";
                System.out.println(message);
                return !condition;
            }
        } else {
            System.out.println("You need to be a member inorder to go in!");
            return condition;
        }
    }
}
