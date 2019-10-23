package src.Day7;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Text is: " + s1);

        int i1 = sc.nextInt();
        System.out.println("Integer is: " + i1);

        //TODO Task 1:
        // Write a program that ask a number:
        // example:
        // Provide a number:
        // 3
        // Your number is 3

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number:");
        int number = scan.nextInt();


        System.out.println("Your number is " + number);
    }

}
