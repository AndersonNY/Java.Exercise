package src.Day4;

public class TestWithPackages {

    public static void main(String[] args) {

        int num1 = 43;
        int num2 = 899;

        TestComparingOperators(num1, num2);

        //   add(num1, num2);
        //   Multiply (num1, num2);
        //   Deduct (num1, num2);


    }

    static void TestComparingOperators(int number1, int number2) {

        // comparing operators : ==, !=, <, <=, >, >=
        //= means assign number1


        if (number1 == number2) {
            System.out.println("Numbers are equal");
            System.out.println("Numbers are equal");

        } else {

            System.out.println("Numbers are not equal");
            System.out.println("Numbers are not equal");


        }

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

    public static void divideMethod(int x, int y) {

        System.out.println(x / y);
    }

    public static void addMethod(int x, int y) {
        System.out.println(x + y);
    }

    public static void detuctionmethod(int x, int y) {

        System.out.println(x - y);
    }

    public static void multiplymethod(int x, int y) {


        System.out.println(x * y);
    }


    private static void Detuct(int x, int y) {
    }

    private static void Multiply(int x, int y) {
    }

    private static void Divide(int x, int y) {
    }

    private static void Addition(int x, int y) {
    }


}




