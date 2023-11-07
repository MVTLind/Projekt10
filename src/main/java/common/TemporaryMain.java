package common;

import java.util.HashMap;
import java.util.Scanner;
import decathlon.Deca100M;

public class TemporaryMain {
    public static void main(String[] args) {
        Deca100M deca100M = new Deca100M();
        InputResult inputResult = new InputResult();
        PersonDataBase DBE = new PersonDataBase(); //<--- Vi har en separat Databas som hanterar
        //våra Personer och relaterade metoder. Själva personens egna metoder och attribut sparas
        //i själva Person klassen.

        Scanner scan = new Scanner(System.in);
        Person currentUser = DBE.getUserTwo(0); //<-- Vi börjar med att hämta en användare
        //try {
        //    Person currentUser = DB.getUser(0); //<-- Vi börjar med att hämta en användare
        //} catch (Exception e) {
        //    System.out.println("No users have been added!\n");
        //    DB.createNewUser();
        //    Person currentUser = DB.getUser(0);
        //}


        //ifrån databasen för att ha någonstans att börja och sätter vår Person currentUser
        //till det Personobjektet.

        System.out.println("Welcome " + currentUser.getName()); //<-- pga detta så får vi namnet på den aktiva
        //användaren här!

        while (true) { //<--- Vi skapar en enkel meny!
            System.out.println("1.Print info");
            System.out.println("2.Create new Person");
            System.out.println("3.Change user");
            System.out.println("4.Add score");
            System.out.println("5.Add Deca100M score");
            System.out.println("6.Exit");

            int input = Integer.parseInt(scan.nextLine());

            switch (input) {
                case 1 -> currentUser.printInfo(); //<-- Vi skriver ut info ifrån den just nu aktiva användaren
                case 2 -> DBE.createNewUser(); //<-- vi kallar på metoden i DB som har hand om att skapa nya Person objekt
                case 3 -> {
                    DBE.printAvailableUsers(); //<-- Vi skriver först ut alla tillgängliga Person objekt och deras ID ifrån vår databas.
                    int index = Integer.parseInt(scan.nextLine());
                    currentUser = DBE.getUserTwo(index); //<-- Vi hämtar vårt valda Personobjekt ifrån Databasen med index.
                }
                case 4 -> {
                    System.out.println("Please enter score to add:");
                    currentUser.addScore(Double.parseDouble(scan.nextLine())); //<--- vi lägger till poäng på vår aktiva användare
                }
                case 5 -> {
                    DBE.printAvailableUsers(); //<-- Vi skriver först ut alla tillgängliga Person objekt och deras ID ifrån vår databas.
                    int index = Integer.parseInt(scan.nextLine());
                    currentUser = DBE.getUserTwo(index);
                    System.out.println(currentUser.getdeca100MScore());

                    deca100M.calculateResult(inputResult.enterResult());
                    int result = deca100M.returnResult();

                    //currentUser.setDeca100M(result);
                    System.out.println(currentUser.getdeca100MScore());
                }

                case 6 -> System.exit(0); //<-- Stänger ner programmet
                default -> System.out.println("Invalid input! Try again!"); //<-- Skrivs ut om något felaktigt skrivits in i menyn!

                //HashMap<Integer, Competitor> Competitors = new HashMap<Integer, Competitor>();
                //Competitors.put(competitorCounter, new Competitor(competitorName)); //Creating a new competitor
                //Competitors.put(0, new Competitor("Peter"));


                //Competitors.get(competitorCounter).setDeca100M(SelectDiscipline.deca100MScore); //Setting score
                //System.out.println(Competitors.get(competitorCounter).getDeca100M()); //Printing to show in terminal (devlopment-usage)
            }
        }
    }
}
