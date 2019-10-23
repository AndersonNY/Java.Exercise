package src.Day12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

     public static void main(String[] args) {
            System.out.println("Welcome to Guess a Number game!!!");
            Random rand = new Random();
            int randomNumber = rand.nextInt(10); // 0 -> 10

            Scanner scan = new Scanner(System.in);
            int myNumber = -1;

            while (myNumber != randomNumber) {
                System.out.println("Guess number");
                myNumber = scan.nextInt();
            }

            System.out.println("You win the game");
            System.out.println("Number was " + randomNumber);
        }
    }


