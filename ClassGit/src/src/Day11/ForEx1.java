package src.Day11;

import java.util.Scanner;

public class ForEx1 {


    //task 1 write a program that takes "a" and "b" numbers
    // from console, and show multiplication up to that "a" number
    // ex: a = 3, b = 2
    //     2 => 2 * 1
    //     4 => 2 * 2
    //     6 => 2 * 3


    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Provide a number: ");

        int a = scan.nextInt();

        System.out.println("Provide b number");

        int b = scan.nextInt();


        for (int i =1; i <= 10; i++) {

            System.out.println(a * i);
            System.out.println(b * i);



        }



    }
}

