package BestGymEver.ioutil;

import BestGymEver.Customer;
import BestGymEver.logicutil.PrintingCustomersMembership ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OutputUtil {

    private String date ;
    PrintingCustomersMembership p = new PrintingCustomersMembership() ;

    public  void writeToFile (Path outPath, Customer customer) {
        String readLines = "" ;
        try (PrintWriter w = new PrintWriter (Files.newBufferedWriter(outPath,
                StandardOpenOption.CREATE,StandardOpenOption.APPEND))) {
            readLines = new String(Files.readAllBytes(outPath));
            if (p.printCustomerMembership(customer)) {
                date = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) ;
                String message = customer.getName() + " - " + customer.getSocialSecurityNumber() +
                        " - " + date ;
                if (!readLines.contains(message)) {
                    w.print(customer.getName() + " - " + customer.getSocialSecurityNumber() +
                            " - " + date + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Could not write to the file");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
