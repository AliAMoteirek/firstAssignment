package BestGymEver;

import BestGymEver.logicutil.* ;
import BestGymEver.ioutil.* ;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BestGymEverProgram {
    InputUtil in = new InputUtil() ;
    OutputUtil out = new OutputUtil() ;
    UsersInput ui = new UsersInput() ;
    CustomersValidation cv = new CustomersValidation() ;

    public void BestGymEverProgram() {

        Path inPath = Paths.get("src/BestGymEver/Files/customers.txt") ;
        Path outPath = Paths.get ("src/BestGymEver/Files/loggedInCustomers.txt") ;

        List<Customer> allCutomersList = new ArrayList<>() ;
        allCutomersList = in.readCustomerFromFile(inPath) ;

        String input = ui.readInputData("Please enter your full name or social security number (10 digits):",
                null) ;
        out.writeToFile(outPath,cv.findCustomer(input,allCutomersList));
    }
}
