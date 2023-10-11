package decathlon;

import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Deca110MHurdlesTest {
    @Test
    public void testDeca110() {

        CalcTrackAndField calc = new CalcTrackAndField();

        double A = 0.188807;
        double B = 210;
        double C = 1.41;

        double distance = 399;

        int expected = 0;
        int actual = calc.calculateTrack(A,B,C,distance);
        assertEquals(expected,actual);

    }

    //public void testCalculateResult() {
    //beginning to create another form of test


}