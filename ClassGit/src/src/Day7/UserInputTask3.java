package src.Day7;

import java.util.Scanner;

public class UserInputTask3 {


    // Check if your numner is positive or negative wirh Scanner
    // Where number is -200<=N<=200
    // ex= -123 => negative
    // ex 10 => positive


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Provide a number: ");
            int number = scan.nextInt();

            System.out.println(number);
            if (number < 0) {
                System.out.println("Negative");
            }
            if (number > 0) {
                System.out.println("Positive");
            }
            if (number == 0) {
                System.out.println("it's ZERO");
            }
        }
    }
