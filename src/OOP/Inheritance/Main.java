package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Lion leo = new Lion("Lion", 418, "Africa");
        Kangaroo kenny = new Kangaroo("Kangaroo", 132, "Australia");

        leo.printAnimalInfo();
        System.out.println("");
        kenny.printAnimalInfo();
    }
}
