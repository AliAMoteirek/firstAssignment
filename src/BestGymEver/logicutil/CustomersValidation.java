package BestGymEver.logicutil;

import BestGymEver.Customer;

import java.util.List;

public class CustomersValidation {

    public Customer findCustomer(String input, List<Customer> allCustomers) {
        for (Customer existingCustomer : allCustomers) {
            if (existingCustomer.getName().equalsIgnoreCase(input.trim()) ||
                    existingCustomer.getSocialSecurityNumber().equals(input.trim())){
                return existingCustomer ;
            }
        }
        return null ;
    }

}
