package OOP.Encapsulation;


public class Main {
    public static void main(String[] args) {
        Human jack = new Human("Isma", 23);
        jack.printInfo();
//        System.out.println(jack.name); -> error because name field is private
//        System.out.println(jack.age); -> error because age field is private
    }
}
