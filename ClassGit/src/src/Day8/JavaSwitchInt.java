package src.Day8;

import java.util.Scanner;

public class JavaSwitchInt {

    // 1. write a program that prints word representation of your number
    //      where number is 0 <= N <= 10
    // ex: 0 => zero
    // ex: 3 => three
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("provide a number:");
        int number = scan.nextInt();
        // write switch for: 0 1 2 3 4 5 6 7 8 9 10
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("number is not supported");
                break;
        }

    }
}





