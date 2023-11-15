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
    private String TrackOrField;
    CalcTrackAndField calc = new CalcTrackAndField();

    @And("I enter {double} as my result")
    public void iEnterNumberAsMyResult(double result) {
        if (TrackOrField.equals("Field")) {
            score = calc.calculateField(A, B, C, result);
        }
        else if (TrackOrField.equals("Track")) {
            score = calc.calculateTrack(A, B, C, result);
        }
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
                TrackOrField = "Track";
                A = 25.4347;
                B = 18;
                C = 1.81;
                break;
            }

            case "Deca110MHurdles": {
                TrackOrField = "Track";
                A = 5.74352;
                B = 28.5;
                C = 1.92;
                break;
            }

            case "Deca400M": {
                TrackOrField = "Track";
                A = 1.53775;
                B = 82;
                C = 1.81;
                break;
            }

            case "Deca1500M": {
                TrackOrField = "Track";
                A = 0.03768;
                B = 480;
                C = 1.85;
                break;
            }

            case "DecaDiscusThrow": {
                TrackOrField = "Field";
                A = 12.91;
                B = 4;
                C = 1.1;
                break;
            }

            case "DecaHighJump": {
                TrackOrField = "Field";
                A = 0.8465;
                B = 75;
                C = 1.42;
                break;
            }

            case "DecaJavelinThrow": {
                TrackOrField = "Field";
                A = 10.14;
                B = 7;
                C = 1.08;
                break;
            }

            case "DecaLongJump": {
                TrackOrField = "Field";
                A = 0.14354;
                B = 220;
                C = 1.4;
                break;
            }

            case "DecaPoleVault": {
                TrackOrField = "Field";
                A = 0.2797;
                B = 100;
                C = 1.35;
                break;
            }

            case "DecaShotPut": {
                TrackOrField = "Field";
                A = 51.39;
                B = 1.5;
                C = 1.05;
                break;
            }

            case "Hept100MHurdles": {
                TrackOrField = "Track";
                A = 9.23076;
                B = 26.7;
                C = 1.835;
                break;
            }

            case "Hept200M": {
                TrackOrField = "Track";
                A = 4.99087;
                B = 42.5;
                C = 1.81;
                break;
            }

            case "Hept800M": {
                TrackOrField = "Track";
                A = 0.11193;
                B = 254;
                C = 1.88;
                break;
            }

            case "HeptHightJump": {
                TrackOrField = "Field";
                A = 1.84523;
                B = 75;
                C = 1.348;
                break;
            }

            case "HeptJavelinThrow": {
                TrackOrField = "Field";
                A = 15.9803;
                B = 3.8;
                C = 1.04;
                break;
            }

            case "HeptLongJump": {
                TrackOrField = "Field";
                A = 0.188807;
                B = 210;
                C = 1.41;
                break;
            }

            case "HeptShotPut": {
                TrackOrField = "Field";
                A = 56.0211;
                B = 1.5;
                C = 1.05;
                break;
            }
        }
    }

}
