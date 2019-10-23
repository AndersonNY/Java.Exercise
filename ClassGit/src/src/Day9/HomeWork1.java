package src.Day9;

import java.util.Scanner;

public class HomeWork1<average> {

//    Write a Java program that determines a student’s grade.?
//The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:

//-if the average score >=90% =>grade=A

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a quiz grade:");

        int quiz = scan.nextInt();
        int q = quiz;

        System.out.println("Provide a midterm grade:");
        int midterm = scan.nextInt();
        int m = midterm;

        int finalgrade = scan.nextInt();
        int f = finalgrade;

        System.out.println("Provide a finalgrade grade:");

        int average = (q + m + f) / 3;

        if (average >= 90) {
            System.out.println("Grade is A");
        } else if (average >= 80 && average < 90) {
            System.out.println("Grade is B");
        } else if (average >= 70 && average < 80) {


            System.out.println("Grade is C");

        } else if (average >= 60 && average < 70) {
            System.out.println("Grade is D");

        } else {

            System.out.println("Grade is F");
        }
    }
}




