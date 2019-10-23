package src.Day12;

import java.util.Scanner;

public class DoWhileTask1 {


    // == sign -> equal
// != sign -> not equal


    // task 1, check pin, pin should be 4 digit number
    // if it is not 4 digit number, print "incorrect pin"
    // hint: .length() -> to check length
    // ex: 13123 => "incorrect pin"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin;
        do {
            System.out.println("please write pin");
            pin = scan.nextLine();
            //write you code here
            if (pin.length() != 4) {
                System.out.println("incorrect pin");
            }

        } while (!pin.equals("9999"));
        System.out.println("Take your card, please");
    }
}

