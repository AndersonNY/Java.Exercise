package src.Day9;

import java.util.Scanner;

public class HomeWork3 {

            //    Write a code that displays the name of the day
            //    it declares an int named day whose value represents a day(1-7).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek){

            case 1 :

                System.out.println("Monday");

                break;

            case 2:
                System.out.println("Tuesday");

                break;

            case 3:

                System.out.println("Wednesday");

                break;

            case 4: System.out.println("Thursday");

                break;
            case 5: System.out.println("Friday");

                break;

            case 6:
                System.out.println("Saturday");

                break;

            case 7:

                System.out.println("Sunday");




        }
    }
}



