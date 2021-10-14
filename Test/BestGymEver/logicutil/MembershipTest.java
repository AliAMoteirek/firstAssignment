package BestGymEver.logicutil;

import BestGymEver.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MembershipTest {

    Customer customer1 = new Customer("7603021234" , "Alhambra Aromes" ,
            LocalDate.parse("2020-07-01")) ;
    Customer customer2 = new Customer("8104021234" , "Bear Belle" ,
            LocalDate.parse("2018-12-02")) ;
    Customer customer3 = new Customer("8512021234" , "Chamade Coriola" ,
            LocalDate.parse("2021-03-12")) ;

    Membership m = new Membership() ;
    List<Customer> customerList = new ArrayList<>() ;

    @Test
    public final void hasMembershipExpiredTest() {
        customerList = Arrays.asList(customer1, customer2, customer3) ;
        assertTrue(m.hasMembershipExpired(customer1)) ;
        assertTrue(m.hasMembershipExpired(customer2)) ;
        assertFalse(m.hasMembershipExpired(customer3));

    }
}