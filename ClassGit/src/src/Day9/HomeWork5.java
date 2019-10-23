package src.Day9;

import java.util.Scanner;

public class HomeWork5 {

   //write a program that find the size.
    // user input integer and output the size of the clothes.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Provide your size;");

        int size = scan.nextInt();

        switch (size) {

            case 12:
                System.out.println( "your size is xl");
                break;

            case 10:
                System.out.println("your size is l");
                break;


            case 8:
                System.out.println("your size is m");
                break;

            case 6:
                System.out.println( "your size is s");

            default:
                System.out.println("size is not small,medium,large or X-large,but was");
                break;


        }

    }



}
