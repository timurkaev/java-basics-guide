public class Classes {
    // class fields
    static String name;
    static String surname;
    static int age;

    // class constructor
    Classes(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // class methods
    public static void main(String[] args) {
        printInfo();
    }

    static void printInfo() {
        name = "John";
        surname = "Wick";
        age = 40;
        System.out.println("User name: " + name );
        System.out.println("User name: " + surname );
        System.out.println("User name: " + age );
    }
}
