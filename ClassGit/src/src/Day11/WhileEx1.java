package src.Day11;

import java.util.Scanner;

public class WhileEx1 {

    // part1, write a program which asks you to provide a text
    // and it should stop when you type "quit"

    // part2, continue part1 but also check for Length() of string
    // if length is bigger than 10, program should say that string is too large
    //medium task:
    // rewrite part1 with for loop

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Provide a text");
        String s = scan.nextLine();

        while (!s.equals("quit")) { //s != "exit"
            System.out.println("provide a text");
            s = scan.nextLine();


        }
    }
}


