package OOP.Encapsulation;

public class Human {
    // field encapsulation
    private String name;
    private int age;

    public Human(String n, int a) {
        name = n;
        age = a;
    }

    public void printInfo() {
        System.out.println("My name is " + name + " I`am " + age + " years old" );
    }
}
