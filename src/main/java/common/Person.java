package common;

public class Person {
    private String name;
    private int age;
    private double score;
    private int deca100MScore;
    public Person(String myName, int myAge){ //<--- Det som är i konstruktorn utförs på en gång!
        name = myName;
        age = myAge;
        score = 0; //<--- Poängen sätts alltid till 0 när vi skapar en ny Person
        deca100MScore = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //public void setdeca100MScore(int deca100MScore) {
        //this.deca100MScore = deca100MScore;
    //}
    public int getdeca100MScore() {
        return deca100MScore;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void printInfo(){ //<--- Metod som skriver ut information ifrån det aktiva objektet
        System.out.println("Your name is: " + getName());
        System.out.println("You are " + getAge() + " years old");
        System.out.println("Your current score is: " + getScore());
    }
    public void addScore(double scoreInput){ //<-- Metod som lägger till poäng på nuvarande poäng
        //och sedan sparar den nya poängen med hjälp av setScore
        double newScore = getScore() + scoreInput;
        setScore(newScore);
    }
}