package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Deca1500MTest {
    @Test
    public void testDeca1500() {

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 0.03768;
        double B = 480;
        double C = 1.85;

        double runningTime = 420;

        int expected = 73;
        int actual = calc.calculateTrack(A, B, C, runningTime);
        assertEquals(expected, actual);

    }
    // runningTime anges i sekunder. While loopen i Deca1500M har en if/else som går på minuter <2 >7
    @Test
    public void testDeca1500Fail() {
        //Negative test
        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 0.03768;
        double B = 480;
        double C = 1.85;

        double runningTime = 9;

        int expected = 0;
        int actual = calc.calculateTrack(A, B, C, runningTime);
        assertNotEquals(expected, actual);
    }
}
