package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Deca100MTest {
    @Test
    public void testDeca100() {

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 25.4347;
        double B = 18;
        double C = 1.81;

        double runningTime = 17.8;

        int expected = 1;
        int actual = calc.calculateTrack(A,B,C,runningTime);
        assertEquals(expected,actual);

        //Deca100M peter = new Deca100M();
        //Deca100M.calculateResult();

        //String expected =  "The result is 1096";
        //String actual = "no";

        //assertEquals(expected, actual);

    }

    @Test
    public void testDeca100Fail(){
        //Negative test
        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 25.4347;
        double B = 18;
        double C = 1.81;

        int expected = 0;
        int actual = calc.calculateTrack(A,B,C,5);
        assertNotEquals(expected,actual);
    }

}