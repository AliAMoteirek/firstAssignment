package BestGymEver.logicutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersInputTest {

    UsersInput ui = new UsersInput() ;

    @Test
    public final void readInputDataTest() {
        ui.condition = true ;
        String message = "Hello" ;
        assertTrue(ui.readInputData("Hej", message).equals("Hello")) ;
        assertFalse(ui.readInputData("Hej", message).equals("Hell0"));
    }
}