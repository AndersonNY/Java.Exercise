package src.Day4;

public class Homework {


    public static void main(String[] args) {
        // inside your main method
        // call Add (num1, num2);
        // call Multiply (num1, num2);
        // call Deduct (num1, num2);
        // call Divide (num1, num2)

        int x = 8;
        int y = 10;

        Addition(x, y);
        Divide(x, y);
        Multiply(x, y);
        Detuct(x, y);
    }


    private static void Detuct(int x, int y) {
        System.out.println(x - y);
    }


    private static void Multiply(int x, int y) {
        System.out.println(x * y);


    }

    private static void Divide(int x, int y) {
        System.out.println(x / y);
    }

    private static void Addition(int x, int y) {

        System.out.println(x + y);
        System.out.println(x + y);


    }
}