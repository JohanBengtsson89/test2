public class Numbers {
    public static void main(String[] args){

        Calculator c = new Calculator();
        int a = 3;
        int b = 6;


        System.out.println(c.add(a, b));
        addNumbers(a,b);

    }
    static void addNumbers(int x, int y){
        System.out.println(x + y);
    }
}
