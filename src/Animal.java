public class Animal {

    String type;
    String name;
    int age;
    int numberOfLegs;
    boolean isHungry;

    //Constructor


    public Animal() {

    }

    public Animal(String type, String name, int age, int numberOfLegs, boolean isHungry) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.isHungry = isHungry;
    }

// Beteenden


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", isHungry=" + isHungry +
                '}';
    }
}
