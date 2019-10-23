package src.Day11;

import java.util.Scanner;

public class LoopsHomeWork {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Provide a number:");
            int number = scan.nextInt();

            for(int i = 1; i <= 10; i++){
                System.out.println(number * i);
            }
        }

    }

