package src.Day8;

import java.util.Scanner;

public class IfElse7 {

        // Task Evaluate result of exam
        // A => excellent
        // B => good
        // C => middle
        // D => pass
        // F => fail
        // TODO Hint: nextLine, String, equals, equalsIgnoreCase
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Provide a grade: [A, B, C, D, F]");
            String grade = scan.nextLine();

            if (grade.equals("A")) {
                System.out.println("excellent");
            } else if ("B".equals(grade)) {
                System.out.println("good");
            } else if (grade.equals("C")) {
                System.out.println("middle");
            } else if (grade.equals("D")) {
                System.out.println("pass");
            } else if (grade.equals("F")) {
                System.out.println("fail");
            } else {
                System.out.println("invalid grade");
            }
        }

        //Task 2
        // continue task 1 but also check for B+, B-, C+, C-, D+, D-
        // ex:
        // B+ or B or B- => Good
        // C+ or C or C- => middle
        // D+ or D or D- => pass
        // TODO Hint: in java logical operator for OR is || , two vertical lines

        //
    }



    //Task 2
// continue task 1 but also check for B+, B-, C+, C-, D+, D-
// ex:
// B+ or B or B- => Good
// C+ or C or C- => middle
// D+ or D or D- => pass
// TODO Hint: in java logical operator for OR is || , two vertical lines

//


