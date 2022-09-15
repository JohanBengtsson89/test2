import java.sql.SQLOutput;

public class Zoo {
    public static void main(String[] args) {
             // Fyra djur
        Animal snake = new Animal("Cobra", "Orm", 5, 0, true);
        Animal monkey = new Animal("Chimp","George", 12, 2, true);
        Animal spider = new Animal("Black widow", "Billy", 2, 8, false);
        Animal bird = new Animal("Eagle", "Ernie", 5, 2,true);

              // Fyra personer som jobbar på zoo
        Person person1 = new Person("Johan", "Manager", 33, "Man");
        Person person2 = new Person("Johanna", "Caretaker", 29, "Women");
        Person person3 = new Person("Johannes", "Cleaner", 25, "Man");
        Person person4 = new Person("Johnny", "Security guard", 35, "Man");

        printPerson(person1);
        printPerson(person2);
        printPerson(person3);
        printPerson(person4);
        System.out.println();

        printAnimal(snake);
        printAnimal(spider);
        printAnimal(monkey);
        printAnimal(bird);


        
    }
    static void printPerson(Person input){
        System.out.println(input.name +" "+ input.age +" "+ input.job +" "+ input.sex);
    }
    static void printAnimal(Animal input){
        System.out.println(input.type + " " + input.name + " " + input.age +
                " " + input.numberOfLegs + " " + input.isHungry);
}   }
