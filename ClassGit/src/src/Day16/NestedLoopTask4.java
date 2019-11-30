package src.Day16;

public class NestedLoopTask4 {
    public static void main(String[] args) {


        // Write program that prints this using loops
        //          *
        //         **
        //        ***
        //       ****
        //      *****

        System.out.println("Hard Coded.........");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println("Using Loops........");
        for (int a = 0; a <= 5; a++) {

            for (int b = 5; b >= 0; b--) {

                if (b <= a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }    }
System.out.println();


        }





    }
}


