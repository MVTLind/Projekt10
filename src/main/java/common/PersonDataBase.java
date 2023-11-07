package common;
import java.util.HashMap;
import java.util.Scanner;
public class PersonDataBase {
    HashMap<Integer,Person> users = new HashMap<>();//<--- Vi skapar en HashMap för att spara en int och ett Personobjekt i key-value pairs
    public PersonDataBase(){//<--- Skapar ett par användare i konstruktorn så att vi har något innehåll att testa med.
        Person adam = new Person("Adam",36);
        Person johan = new Person("Johan",22);
        users.put(0,adam);
        users.put(1,johan);//<-- Vi sparar våra Person objekt i HashMap igenom att ange indexposition och sedan objektets namn
    }
    public void createNewUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a new name");
        String newUserName = scan.nextLine();
        System.out.println("Please enter your age");
        int newAge = Integer.parseInt(scan.nextLine());
        Person newPerson = new Person(newUserName,newAge); //<-- Vi skapar ett generiskt Person objekt med informationen vi skrivit in
        users.put(users.size(),newPerson); //<-- Vi lägger till objektet i vår HashMap på den sista positionen (users.size() blir den sista positionen
        //och newPerson är vårt nya Person objekt).
    }
    public Person getUserTwo(int index){ //<--- Returnerar ett helt Person objekt med hjälp av Id/index
        return users.get(index);
    }
    public void printAvailableUsers(){ //<--- Den här metoden skriver ut information ifrån vår HashMap
        for (Integer key : users.keySet()){
            System.out.println("Id:" + key + ", Name:" + users.get(key).getName());
        }
        System.out.print("Please write an Id to choose that user:");
    }
}