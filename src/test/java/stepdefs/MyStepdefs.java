package stepdefs;
import common.CalcTrackAndField;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private double A;
    private double B;
    private double C;
    private double score;
    CalcTrackAndField calc = new CalcTrackAndField();




    @And("I enter {double} as my result")
    public void iEnterNumberAsMyResult(double result) {
        score = calc.calculateTrack(A, B, C, result);
    }

    @Then("I can verify my score as {double}")
    public void iCanVerifyMyScoreAsResult(double expected) {
        double actual = this.score;
        assertEquals(expected,actual, 0.01);
    }

    @Given("I have selected {string} meters")
    public void iHaveSelectedMeters(String discipline) {
        switch (discipline) {
            case "Deca100M": {
                A = 25.4347;
                B = 18;
                C = 1.81;
                break;
            }
            case "Deca400M": {
                A = 1.53775;
                B = 82;
                C = 1.81;
                break;
            }
        }
    }
}
