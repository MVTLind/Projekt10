package common;

import decathlon.*;

public class Main {

	public static void main(String[] args) {
		boolean choice = true;
		InputName inputName = new InputName();
		inputName.addCompetitor();

		while (choice = true) {


			SelectDiscipline selectDiscipline = new SelectDiscipline();
			selectDiscipline.inputSelection(inputName);
		}
		choice = false;

	}
}
