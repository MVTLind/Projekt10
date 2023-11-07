package common;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    //Receive input	of selection of discipline.

    int optionSelected;
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    SelectDiscipline selectDiscipline = new SelectDiscipline();
    CompetitorDataBase DB = new CompetitorDataBase();

    public void inputSelection() {
        Scanner scan = new Scanner(System.in);
        Competitor currentUser = DB.getUser(0);

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
    public void makeSelection(int optionSelected) {

        switch (optionSelected) {
            case 1:
                InputName inputName = new InputName();
                inputName.addCompetitor();
                selectDiscipline.inputSelection(inputName);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
//                Print all existing competitors
//                Ask user: which competitor do you want to see all scores in
//                Print all scores for CHOSEN competitor with all branches
                System.out.print("Here is all competitors:\n");
                selectDiscipline.printAvailableUsers();
                System.out.print("Please select competitor with Id number:\n");
                int index = Integer.parseInt(sc.nextLine());
                selectDiscipline.currentUser.printAllScores();

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
