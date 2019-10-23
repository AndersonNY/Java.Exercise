package src.Day9;

public class Corrections {


    public static void main(String[] args) {
        int x = 10;
        switch (x + 1 + 1) {
            case 10:
                System.out.println("HELLO");
                break;
            case 10 + 1 + 1:
                System.out.println("TECHNO");
                break;
        }
    }

////Output:
////1. Compile time error
////2. TECHNO
////3. HELLO
////4. No Output


    //what is the output here


    public static void main2(String[] args) {
        int a = 2;
        int b = 5;

        // here the question mark means if
        // : symbol means else
        int min = (a <= b) ? a : b;

        if (a <= b) {
            min = a;
        } else {
            min = b;
        }

        System.out.println(min);
    }
}
