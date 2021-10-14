package BestGymEver.ioutil;

import BestGymEver.Customer;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public List<Customer> readCustomerFromFile (Path inPath) {
        String firstLine;
        String secondLine;
        List<Customer> allCustomerList = new ArrayList<>() ;
        String[] firstLineSplitted = new String [2] ;
        LocalDate local = null ;

        try (Scanner scan = new Scanner(inPath)) {
            while (scan.hasNext()) {
                firstLine = scan.nextLine() ;
                firstLineSplitted = firstLine.split(",") ;
                if (scan.hasNext()) {
                    secondLine = scan.nextLine().trim();
                    local = LocalDate.parse(secondLine) ;
                }
                Customer customer = new Customer(
                        firstLineSplitted[0].trim(), firstLineSplitted[1].trim(), local) ;
                allCustomerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("Could not read the file");
            e.printStackTrace();
            System.exit(0);
        }
        return allCustomerList ;
    }
}
