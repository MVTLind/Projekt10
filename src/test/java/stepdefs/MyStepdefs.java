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

            case "Deca110MHurdles": {
                A = 5.74352;
                B = 28.5;
                C = 1.92;
                break;
            }

            case "Deca400M": {
                A = 1.53775;
                B = 82;
                C = 1.81;
                break;
            }

            case "Deca1500M": {
                A = 0.03768;
                B = 480;
                C = 1.85;
                break;
            }

            case "DecaDiscusThrow": {
                A = 12.91;
                B = 4;
                C = 1.1;
                break;
            }

            case "DecaHighJump": {
                A = 0.8465;
                B = 75;
                C = 1.42;
                break;
            }

            case "DecaJavelinThrow": {
                A = 10.14;
                B = 7;
                C = 1.08;
                break;
            }

            case "DecaLongJump": {
                A = 0.14354;
                B = 220;
                C = 1.4;
                break;
            }

            case "DecaPoleVault": {
                A = 0.2797;
                B = 100;
                C = 1.35;
                break;
            }

            case "DecaShotPut": {
                A = 51.39;
                B = 1.5;
                C = 1.05;
                break;
            }
        }
    }
}
