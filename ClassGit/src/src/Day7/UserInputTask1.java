package src.Day7;

import java.util.Scanner;

//TODO Task 1:
// Write a program that ask a number,
// in your console it should print same as below:
// Provide a number:
// 3
// Your number is 3
public class UserInputTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number:");
        int number = scan.nextInt();


        System.out.println("Your number is " + number);
    }

    //TODO Task 2:
    // Write a program that ask two number,
    // in your console it should print same as below:
    // Provide a first number:
    // 3
    // Your first number is 3
    // Provide a second number:
    // 5
    // Your second number is 5
}