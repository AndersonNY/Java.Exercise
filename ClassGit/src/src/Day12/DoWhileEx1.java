package src.Day12;

import java.util.Scanner;

public class DoWhileEx1 {

// == sign -> equal
// != sign -> not equal

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin = 0;
        do {
            System.out.println("Write your PIN: ");
            pin = scan.nextInt();

            // task 1, check pin, pin should be 4 digit number
            // if it is not 4 digit number, print "incorrect pin"
            // hint 999 <PIN <10000
            // ex: 13123 => "incorrect pin"

        } while (pin != 9999);
        System.out.println("Take you card");
    }


}
