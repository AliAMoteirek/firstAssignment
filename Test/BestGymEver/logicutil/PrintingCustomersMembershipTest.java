package BestGymEver.logicutil;

import BestGymEver.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrintingCustomersMembershipTest {

    Customer customer1 = new Customer("7603021234" , "Alhambra Aromes" ,
            LocalDate.parse("2020-07-01")) ;
    Customer customer2 = null ;
    Customer customer3 = new Customer("8512021234" , "Chamade Coriola" ,
            LocalDate.parse("2021-03-12")) ;

    PrintingCustomersMembership pcm = new PrintingCustomersMembership() ;

    @Test
    public final void printCustomerMembershipTest() {
        assertTrue(pcm.printCustomerMembership(customer3)) ;
        assertFalse(pcm.printCustomerMembership(customer1)) ;
        assertFalse(pcm.printCustomerMembership(customer2)) ;
    }
}