package src.Day9;

import java.util.Scanner;

public class HomeWork2 {

//    Find the Largest Number Among Three Numbers using user Input
//   Finding largest of three numbers using if-else..if
//    int a = 34;

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int a= 35;
        int b= 47;
        int c= 53;

        if (a>b && a>c) {

            System.out.println("largest number is a");
        }

        else if (b>a && b>c) {

            System.out.println("largest number is b");
        }

            else {
                System.out.println("largest number is c");


        }
    }




}
