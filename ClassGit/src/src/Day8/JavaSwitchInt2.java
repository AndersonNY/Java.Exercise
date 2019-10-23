package src.Day8;

import java.util.Scanner;

public class JavaSwitchInt2 {


    // write a program which will tell you day of week
// 1 2 3 4 5 6 7
// Monday, Tuesday etc..
// 1 => Monday
// 7 => Sunday

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




