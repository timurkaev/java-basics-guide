package OOP.NestedClasses;

public class Human {
    public Name name;
    public Age age;
    public Weight weight;
    public Height height;

    public Human() {
        this.name = new Name();
        this.age = new Age();
        this.weight = new Weight();
        this.height = new Height();
    }

    void printInfo() {
        System.out.println("Name: " + name.name);
        System.out.println("Name: " + age.age);
        System.out.println("Name: " + weight.weight);
        System.out.println("Name: " + height.height);
    }

    class Name {
        String name = "Vasya";
    }

    class Age {
        int age = 22;
    }

    class Weight {
        int weight = 90;
    }

    class Height {
        int height = 190;
    }
}
