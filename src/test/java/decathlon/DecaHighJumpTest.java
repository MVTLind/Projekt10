package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DecaHighJumpTest {
    @Test
    public void testDecaHighJump() {

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 0.8465;
        double B = 75;
        double C = 1.42;

        double jumpHeight = 150;

        int expected = 389;
        int actual = calc.calculateField(A, B, C, jumpHeight);
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaHighJumpFail() {
        //Negative test
        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 0.8465;
        double B = 75;
        double C = 1.42;

        double jumpHeight = 400;

        int expected = 0;
        int actual = calc.calculateField(A, B, C, jumpHeight);
        assertNotEquals(expected, actual);
    }
}
