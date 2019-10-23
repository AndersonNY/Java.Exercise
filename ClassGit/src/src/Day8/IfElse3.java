package src.Day8;

import java.util.Scanner;

public class IfElse3 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int number = scan.nextInt();

            if(number > 0){
                System.out.println("Number is bigger than zero");
            } else if(number < 0){
                System.out.println("Number is less than zero");
            } else {
                System.out.println("Number is zero");
            }
        }
    }






