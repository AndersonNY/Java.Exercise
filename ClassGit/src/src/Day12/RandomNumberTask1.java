package src.Day12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTask1 {


        //part1
        //  end loop if you failed to guess a number after 3 try
        // Hint: counter, break, if


        //part2
        //  fix if statements, check numbers correctly
        public static void main(String[] args) {
            System.out.println("Welcome to Guess a Number game!!!");
            Random rand = new Random();
            int randomNumber = rand.nextInt(10); // 0 <-> 10

            Scanner scan = new Scanner(System.in);
            System.out.println("Hey, how many time you wanna try ?");
            int numberOfTry = scan.nextInt();
            System.out.println("You choose " + numberOfTry);

            int myNumber = -1;
            int counter = 1;
            while (true) {
                System.out.println("Provide number");
                myNumber = scan.nextInt();
                if (myNumber < randomNumber) {
                    System.out.println("Provide a greater number");
                } else if (myNumber > randomNumber) {
                    System.out.println("Provide a smaller number");
                } else if (myNumber == randomNumber) {
                    System.out.println("You win the game");
                    break;
                }

                if (counter == numberOfTry) {
                    System.out.println("you failed to guess a number, sorry, better luck next time");
                    break;
                }

                counter++;
            }

            System.out.println("Number was " + randomNumber);
        }



    }
