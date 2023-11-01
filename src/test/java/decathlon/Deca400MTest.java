package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Deca400MTest {
    @Test
    public void testDeca400(){

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 1.53775;
        double B = 82;
        double C = 1.81;

        double runningTime = 80;

        int expected = 5;
        int actual = calc.calculateTrack(A,B,C,runningTime);
        assertEquals(expected,actual);
    }

    @Test
    public void testDeca400Fail(){
        //Negative test
        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 1.53775;
        double B = 82;
        double C = 1.81;

        double runningTime = 18;

        int expected = 0;
        int actual = calc.calculateTrack(A,B,C,runningTime);
        assertNotEquals(expected,actual);
    }
}
