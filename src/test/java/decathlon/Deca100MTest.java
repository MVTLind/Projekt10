package decathlon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Deca100MTest {
    @Test
    void testNumber() {

        Deca100M peter = new Deca100M();
        Deca100M.calculateResult();

        String expected =  "The result is 1096";
        String actual = "no";

        assertEquals(expected, actual);
    }

}