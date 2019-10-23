package src.Day8;

import java.util.Scanner;

public class HomeWork {

    //input; 1,2,3,8,9  testing with different data and with different input

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("provide a day Monday to Sunday");

        String dayOfWeek= scan.nextLine();

        switch (dayOfWeek) {

            case "Monday":
                System.out.println("1");

                break;

            case "Tuesday":

                System.out.println ("2");

                break;

            case "Wednesday":

                System.out.println("3");

                break;

            case "Thursday":

                System.out.println("4");

                break;

            case "Friday":

                System.out.println("5");

                break;

            case "Saturday":

                System.out.println("6");

            case "Sunday":

                System.out.println("7");





        }

    }
}


    // Task 2 / Homework:
// Continue task 1, but do opposite
// Monday => 1
// Tuesday => 2
// Sunday => 7


   //public class Test {
    //   public static void main(String[] args)
      //  {
        //    int x = 10;
          //  if (x) {
            //    System.out.println("HELLO TECHNO");
       //     System.out.println("WELCOME");

     //   else
       //     {
         //       System.out.println("BYE");
         //  }
      //  }
   // }



