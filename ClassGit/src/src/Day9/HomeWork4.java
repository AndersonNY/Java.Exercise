package src.Day9;

import java.util.Scanner;

public class HomeWork4 {

    //    write code to find out if a day is a weekday or a weekend day. use switch statement


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide weekdays : ");

        int Weekdays = scan.nextInt();

        switch (Weekdays) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");

                break;
            default:
                System.out.println("weekend");
        }
    }
}

//Scanner dayOfWeek=new Scanner(System.in);
//    System.out.println("Today is");
//    int day=dayOfWeek.nextInt();
//
//
//    switch(day){
//        case 1 :
//            System.out.println("Monday is a weekday");
//            break;
//        case 2:
//            System.out.println("Tuesday is a weekday");
//            break;
//        case 3:
//            System.out.println("Wednesday is a weekday");
//            break;
//        case 4:
//            System.out.println("Thursday is a weekday");
//            break;
//        case 5:
//            System.out.println("Friday is a weekday");
//            break;
//        case 6:
//            System.out.println("Saturday is a weekend");
//            break;
//        case 7:
//            System.out.println("Sunday is a weekend");
//            break;
//
//
//
//
//
//    }
//}
//}