package common;

import java.util.Scanner;

import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

	int disciplineSelected;
	InputResult inputResult = new InputResult();
	Scanner sc = new Scanner(System.in);
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump decaHighJump = new DecaHighJump();
	DecaDiscusThrow decaDiscusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault decaPoleVault = new DecaPoleVault();
  
	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHightJump hepHighJump = new HeptHightJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

	//Receive input	of selection of discipline.

	public void inputSelection(InputName name) {
		System.out.println("Select discipline.");
		printDisciplines();

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			makeSelection(name);

		} catch (Exception e) {
			System.out.println("Invalid input, try again---.");
			System.out.println("");
			printDisciplines();
		}

	}

	// Check input of discipline.
	public void makeSelection(InputName name) {

		Integer partialScore = 0;

		switch (disciplineSelected) {
		case 1:
			deca100M.calculateResult(inputResult.enterResult());
			break;
		case 2:
			deca400M.calculateResult(inputResult.enterResult());
			break;
		case 3:
			deca110MHurdles.calculateResult(inputResult.enterResult());
			break;
		case 4:
			deca1500M.calculateResult(inputResult.enterResult());
			break;
		case 5:
			decaLongJump.calculateResult(inputResult.enterResult());
			break;
		case 6:
			decaHighJump.calculateResult(inputResult.enterResult());
			break;
		case 7:
			decaPoleVault.calculateResult(inputResult.enterResult());
			break;
		case 8:
			decaDiscusThrow.calculateResult(inputResult.enterResult());
			break;
		case 9:
			decaJavelinThrow.calculateResult(inputResult.enterResult());
			break;
		case 10:
			decaShotPut.calculateResult(inputResult.enterResult());
			break;
		case 11:
			hep200M.calculateResult(inputResult.enterResult());
			break;
		case 12:
			hep800M.calculateResult(inputResult.enterResult());
			break;
		case 13:
			hep100MHurdles.calculateResult(inputResult.enterResult());
			break;
		case 14:
			hepHighJump.calculateResult(inputResult.enterResult());
			break;
		case 15:
			hepLongJump.calculateResult(inputResult.enterResult());
			break;
		case 16:
			hepShotPut.calculateResult(inputResult.enterResult());
			break;
		case 17:
			partialScore = hepJavelinThrow.calculateResult(inputResult.enterResult());
			name.score = partialScore + name.score;
			break;
		case 18:
			System.out.println(name.score);
			break;

		default:
			System.out.println("Invalid input, try again:::.");
			System.out.println("");
			inputSelection(name);
			break;
		}
	}

	// Needs more stuff.
	public void printDisciplines() {
		System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
		System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
		System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
		System.out.println("4. Decathlon 1500 meters. (Measured in minutes and seconds)");
		System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
		System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
		System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
		System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
		System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
		System.out.println("10. Decathlon Shot Put. (Measured in meters)");
		System.out.println("11. Heptathlon 200 meters. (Measured in seconds)");
		System.out.println("12. Heptathlon 800 meters. (Measured in minutes and seconds)");
		System.out.println("13. Heptathlon 100 meters hurdles. (Measured in seconds)");
		System.out.println("14. Heptathlon High Jump. (Measured in centimeters)");
		System.out.println("15. Heptathlon Long Jump. (Measured in centimeters)");
		System.out.println("16. Heptathlon Shot Put. (Measured in meters)");
		System.out.println("17. Heptathlon Javelin Throw. (Measured in meters)");
	}

}