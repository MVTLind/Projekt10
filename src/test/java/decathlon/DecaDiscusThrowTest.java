package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecaDiscusThrowTest {
    @Test
    public void testDecaDiscusThrow() {

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 12.91;
        double B = 4;
        double C = 1.1;

        double throwDistance = 15;

        int expected = 180;
        int actual = calc.calculateField(A, B, C, throwDistance);
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaDiscusThrowFail() {
        //Negative test
        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 12.91;
        double B = 4;
        double C = 1.1;

        double throwDistance = 90;

        int expected = 0;
        int actual = calc.calculateField(A, B, C, throwDistance);
        assertNotEquals(expected, actual);
    }
}
