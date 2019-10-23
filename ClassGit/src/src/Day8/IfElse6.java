package src.Day8;

import java.util.Scanner;

public class IfElse6 {

    // Task Evaluate result of exam
    // A => excellent
    // B => good
    // C => middle
    // D => pass
    // F => fail
    // TODO Hint: nextLine, String, equals, equalsIgnoreCase
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a grade:");
        String grade = scan.nextLine();

        if (grade.equals("A")) {
            System.out.println("excellent");
        } else if ("B".equals(grade)) {
            System.out.println("good");
        }

        if (grade.equals("C")) {

            System.out.println("middle");

        } else if ("D".equals(grade)) {

            System.out.println("pass");

            if (grade.equals("F")) {
                System.out.println("fail");

            }
        }


    }


}
