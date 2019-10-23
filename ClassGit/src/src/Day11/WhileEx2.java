package src.Day11;

import java.util.Scanner;

public class WhileEx2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String line = "";

        // part1

        while (!line.equals("quit")) {

            System.out.println("Write a string");
            line = scan.nextLine();


            while (line.length() >= 10) { // "quit.length () =4 => 4 >=10

                System.out.println("string is too large");
            }

            while (line.equals("Max")) { // "quit" == "Max" ==> false

                System.out.println("Write a string");

                line = scan.nextLine();

                System.out.println("Adams");


            }


        }
    }

}