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

	int result = 0;
	CompetitorDataBase DB = new CompetitorDataBase();
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
  
	Hept200M hept200M = new Hept200M();
	Hept800M hept800M = new Hept800M();
	Hept100MHurdles hept100MHurdles = new Hept100MHurdles();
	HeptHighJump heptHighJump = new HeptHighJump();
	HeptLongJump heptLongJump = new HeptLongJump();
	HeptShotPut heptShotPut = new HeptShotPut();
	HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow();

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

		Scanner scan = new Scanner(System.in);

		switch (disciplineSelected) {
		case 1:
			deca100M.calculateResult(inputResult.enterResult());
			result = deca100M.returnResult();
			DB.getUser(0).setDeca100M(result);
			break;
		case 2:
			deca400M.calculateResult(inputResult.enterResult());
			result = deca400M.returnResult();
			DB.getUser(0).setDeca400M(result);
			break;
		case 3:
			deca110MHurdles.calculateResult(inputResult.enterResult());
			result = deca110MHurdles.returnResult();
			DB.getUser(0).setDeca110MHurdles(result);
			break;
		case 4:
			deca1500M.calculateResult(inputResult.enterResult());
			result = deca1500M.returnResult();
			DB.getUser(0).setDeca1500M(result);
			break;
		case 5:
			decaLongJump.calculateResult(inputResult.enterResult());
			result = decaLongJump.returnResult();
			DB.getUser(0).setDecaLongJump(result);
			break;
		case 6:
			decaHighJump.calculateResult(inputResult.enterResult());
			result = decaHighJump.returnResult();
			DB.getUser(0).setDecaHighJump(result);
			break;
		case 7:
			decaPoleVault.calculateResult(inputResult.enterResult());
			result = decaPoleVault.returnResult();
			DB.getUser(0).setDecaPoleVault(result);
			break;
		case 8:
			decaDiscusThrow.calculateResult(inputResult.enterResult());
			result = decaDiscusThrow.returnResult();
			DB.getUser(0).setDecaDiscusThrow(result);
			break;
		case 9:
			decaJavelinThrow.calculateResult(inputResult.enterResult());
			result = decaJavelinThrow.returnResult();
			DB.getUser(0).setDecaJavelinThrow(result);
			break;
		case 10:
			decaShotPut.calculateResult(inputResult.enterResult());
			result = decaShotPut.returnResult();
			DB.getUser(0).setDecaShotPut(result);
			break;
		case 11:
			hept200M.calculateResult(inputResult.enterResult());
			result = hept200M.returnResult();
			DB.getUser(0).setHept200M(result);
			break;
		case 12:
			hept800M.calculateResult(inputResult.enterResult());
			result = hept800M.returnResult();
			DB.getUser(0).setHept800M(result);
			break;
		case 13:
			hept100MHurdles.calculateResult(inputResult.enterResult());
			result = hept100MHurdles.returnResult();
			DB.getUser(0).setHept100MHurdles(result);
			break;
		case 14:
			heptHighJump.calculateResult(inputResult.enterResult());
			result = heptHighJump.returnResult();
			DB.getUser(0).setHeptHighJump(result);
			break;
		case 15:
			heptLongJump.calculateResult(inputResult.enterResult());
			result = heptLongJump.returnResult();
			DB.getUser(0).setHeptLongJump(result);
			break;
		case 16:
			heptShotPut.calculateResult(inputResult.enterResult());
			result = heptShotPut.returnResult();
			DB.getUser(0).setHeptShotPut(result);
			break;
		case 17:
			heptJavelinThrow.calculateResult(inputResult.enterResult());
			result = heptJavelinThrow.returnResult();
			DB.getUser(0).setHeptJavelinThrow(result);
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

	public void printAvailableUsers(){
		DB.printAvailableUsers();
	}

	public Competitor getUser(int index){
		return DB.getUser(index);
	}

	public void printAllScores(int index){
		//DB.getUser(0).printAllScores();
		DB.getUser(0).printAllScores();
	}
}