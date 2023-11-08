package common;
import java.util.HashMap;
import java.util.Scanner;
public class CompetitorDataBase {
    HashMap<Integer,Competitor> users = new HashMap<>();//<--- Vi skapar en HashMap för att spara en int och ett Personobjekt i key-value pairs
    public CompetitorDataBase(){//<--- Skapar ett par användare i konstruktorn så att vi har något innehåll att testa med.
        Competitor adam = new Competitor("Adam");
        Competitor johan = new Competitor("Johan");
        users.put(0,adam);
        users.put(1,johan);//<-- Vi sparar våra Person objekt i HashMap igenom att ange indexposition och sedan objektets namn
    }
    public void createNewUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a new name");
        String newUserName = scan.nextLine();
        Competitor newCompetitor = new Competitor(newUserName); //<-- Vi skapar ett generiskt Person objekt med informationen vi skrivit in
        users.put(users.size(),newCompetitor); //<-- Vi lägger till objektet i vår HashMap på den sista positionen (users.size() blir den sista positionen
        //och newPerson är vårt nya Person objekt).
    }
    public Competitor getUser(int index){ //<--- Returnerar ett helt Person objekt med hjälp av Id/index
        return users.get(index);
    }
    public void printAvailableUsers(){ //<--- Den här metoden skriver ut information ifrån vår HashMap
        for (Integer key : users.keySet()){
            System.out.println("Id:" + key + ", Name:" + users.get(key).getName());
        }
    }

}