package common;

import java.util.Scanner;

import excel.ExcelReader;

import static java.lang.System.exit;

import java.io.IOException;

public class Menu {
    //Receive input	of selection of discipline.

    int optionSelected;
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    SelectDiscipline selectDiscipline = new SelectDiscipline();

    public void inputSelection() {
        System.out.println("Welcome to the main menu.\nPlease select an option from the menu:");
        printOptions();

        try {

            optionSelected = Integer.parseInt(sc.nextLine());
            makeSelection(optionSelected);

        } catch (Exception e) {
            System.out.println("Invalid input, try again.\n");
            printOptions();
        }

    }

    // Check input of discipline.
    public void makeSelection(int optionSelected) throws IOException {

        switch (optionSelected) {
            case 1:
                InputName inputName = new InputName();
                inputName.addCompetitor();

                SelectDiscipline selectDiscipline = new SelectDiscipline();
                selectDiscipline.inputSelection(inputName);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ExcelReader excelReader = new ExcelReader();
                Scanner sc = new Scanner(System.in);
                String fileName = "";
                String competitorName = "";
		        boolean active = true;
                boolean active2 = true;
		        while (active) {
			        System.out.println("Please enter the name of the file:");
			        try {

				        fileName = sc.nextLine();
				        active = false;
			        } catch (Exception e) {
				        System.out.println("Invalid input, try again."); //Vague error message
			        }

                }
                while (active2){
                    System.out.println("Please enter the name of the competitor:");
			        System.out.println("");
                    try {

				        competitorName = sc.nextLine();
				        active2 = false;
			        } catch (Exception e) {
				        System.out.println("Invalid input, try again."); //Vague error message

                    }
                }


                excelReader.getExcelInfo(fileName, competitorName);

                break;
            case 5:
                break;
            case 0:
                System.out.println("Exiting...");
                running = false;
                break;

            default:
                System.out.println("Invalid input, try again.\n");
                inputSelection();
                break;
        }
    }

    // Needs more stuff.
    public void printOptions() {
        System.out.println("1. Decathlon and Hepathlon calculator");
        System.out.println("2. Delete a current competitor");
        System.out.println("3. Export to an excel-file");
        System.out.println("4. Import from an excel-file");
        System.out.println("5. Display current scores");
        System.out.println("0. Exit");
    }

}
