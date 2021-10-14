package BestGymEver.ioutil;

import BestGymEver.Customer;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputUtilTest {

    Path inPath = Paths.get("Test/Files/customers.txt") ;

    InputUtil input = new InputUtil() ;


    @Test
    public final void readCustomerFromFileTest() {
        List<Customer> customerList = input.readCustomerFromFile(inPath) ;
        assertTrue(customerList.size() == 14) ;
        assertTrue(customerList.get(0).getName().equals("Alhambra Aromes"));
        assertFalse(customerList.size() == 13) ;
    }

}