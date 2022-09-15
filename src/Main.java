public class Main {
    public static void main(String[] args) {

        String firstName1 = "Lena";
        String lastName1 = "Stridsberg";
        int age1 = 32;

        String firstName2 = "Johan";
        String lastName2 = "Bengtsson";
        int age2 =33;

        printContactCard(firstName2, lastName2, age2);

        printFirstName(firstName1);
        printLastName(lastName1);

        printLine();

        printFirstName(firstName2);
        printLastName(lastName2);

        System.out.println(printLineNotVoid());
    }

    static void printContactCard(String firstName, String lastName, int age){
        printFirstName(firstName);
        printLastName(lastName);
        System.out.println("Det här är åldern: " + age);
        printLine();
    }

    static void printFirstName(String firstName){
        System.out.println("Det här är förnamnet: " + firstName);
    }

    static void printLastName(String lastName){
        System.out.println("Det här är efternamnet " + lastName);
    }

    static void printLine(){
        System.out.println("------------------------");
    }

    static String printLineNotVoid(){
        return "------------------------";
    }

    static int getNumberOne(){
        return 1;
    }
}