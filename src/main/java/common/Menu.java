package common;

import java.util.HashMap;
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
    int index;

    public void inputSelection() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the main menu.\nPlease select an option from the menu:");
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
                System.out.print("Which competitor do you want to enter score:\n");
                selectDiscipline.printAvailableUsers();
                index = Integer.parseInt(sc.nextLine());
                selectDiscipline.inputSelection(index);
                break;
            case 2:
                selectDiscipline.DB.createNewUser();
                break;
            case 3:
                selectDiscipline.DB.deleteNewUser();
                break;
            case 4:
                break;
            case 5:
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
            case 6:
//                Print all existing competitors
//                Ask user: which competitor do you want to see all scores in
//                Print all scores for CHOSEN competitor with all branches
                System.out.print("Here is all competitors:\n");
                selectDiscipline.printAvailableUsers();
                System.out.print("Please select competitor with ID number:\n");
                index = Integer.parseInt(sc.nextLine());
                selectDiscipline.getUser(index).printAllScores();
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
        System.out.println("2. Create a new competitor");
        System.out.println("3. Delete a current competitor");
        System.out.println("4. Export to an excel-file (Non-functional)");
        System.out.println("5. Import from an excel-file");
        System.out.println("6. Display current scores");
        System.out.println("0. Exit");
    }

}
