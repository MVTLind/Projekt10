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

import heptathlon.Hept100MHurdles;
import heptathlon.Hept200M;
import heptathlon.Hept800M;
import heptathlon.HeptHighJump;
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
	DecaHighJump decahighJump = new DecaHighJump();
	DecaDiscusThrow decadiscusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault decapoleVault = new DecaPoleVault();

	Hept200M hept200M = new Hept200M();
	Hept800M hept800M = new Hept800M();
	Hept100MHurdles hept100MHurdles = new Hept100MHurdles();
	HeptHighJump hepHighJump = new HeptHighJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();
	
	//Receive input	of selection of discipline.

	public void inputSelection() {
		System.out.println("Select discipline.");
		printDisciplines();

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			makeSelection();

		} catch (Exception e) {
			//The Exceptions are called if the input contains anything that is not an int
			System.out.println("Invalid input, only use numbers, try again.");
			//System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}

	}

	// Check input of discipline.
	public void makeSelection() {
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
			decahighJump.calculateResult(inputResult.enterResult());
			break;
		case 7:
			decapoleVault.calculateResult(inputResult.enterResult());
			break;
		case 8:
			decadiscusThrow.calculateResult(inputResult.enterResult());
			break;
		case 9:
			decaJavelinThrow.calculateResult(inputResult.enterResult());
			break;
		case 10:
			decaShotPut.calculateResult(inputResult.enterResult());
			break;
		case 11:
			hept200M.calculateResult(inputResult.enterResult());
			break;
		case 12:
			hept800M.calculateResult(inputResult.enterResult());
			break;
		case 13:
			hept100MHurdles.calculateResult(inputResult.enterResult());
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
			hepJavelinThrow.calculateResult(inputResult.enterResult());
			break;
		default:
			//This Exception is thrown when a number that is not in cases is being input
			System.out.println("Only use the corresponding number for the Discipline you're choosing");
			//System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
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
		System.out.println("11. Heptathlon 200 meters.");
		System.out.println("12. Heptathlon 800 meters.");
		System.out.println("13. Heptathlon 100 meters hurdles.");
		System.out.println("14. Heptathlon High Jump.");
		System.out.println("15. Heptathlon Long Jump.");
		System.out.println("16. Heptathlon Shot Put.");
		System.out.println("17. Heptathlon Javelin Throw.");
	}

}