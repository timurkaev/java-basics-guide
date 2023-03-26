package OOP.Inheritance;

public class Animals {
    private String name;
    private int weight;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void printAnimalInfo() {
        System.out.println("Animal: " + getName() + "\n" + "Weight: " + getWeight() + "lbs" + "\n" + "location: " + getLocation());
    }
}
