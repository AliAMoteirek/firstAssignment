package BestGymEver.ioutil;

import BestGymEver.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OutputUtilTest {

    OutputUtil out = new OutputUtil();
    Path outPath = Paths.get("Test/Files/loggedInCustomersTest.txt");

    @AfterEach
    void tearDown() {
        try {
            Files.delete(outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final int countLinesInFile(Path outPath) {
        int numOfLines = 0;
        try (BufferedReader reader = Files.newBufferedReader(outPath)) {
            while (reader.readLine() != null) {
                numOfLines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOfLines;
    }

    @Test
    public final void writeToFile() {
        Customer customer1 = new Customer("7603021234", "Alhambra Aromes"
                , LocalDate.now());
        Customer customer2 = new Customer("8104021234", "Bear Belle"
                , LocalDate.parse("2018-12-02"));

        out.writeToFile(outPath, customer1);
        out.writeToFile(outPath, customer2);

        assertTrue(countLinesInFile(outPath) == 1);
        assertFalse(countLinesInFile(outPath) == 2);
    }
}