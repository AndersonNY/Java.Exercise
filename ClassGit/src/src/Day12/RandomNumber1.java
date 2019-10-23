package src.Day12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber1 {

     public static void main(String[] args) {
            System.out.println("Welcome to Guess a Number game!!!");
            Random rand = new Random();
            int randomNumber = rand.nextInt(10); // 0 -> 10

            Scanner scan = new Scanner(System.in);
            int myNumber = -1;

            while (myNumber != randomNumber) {
                System.out.println("Provide number");
                myNumber = scan.nextInt();

                if(myNumber < randomNumber){
                    System.out.println("Provide a greater number");
                }else{
                    System.out.println("Provide a smaller number");
                }

                //part1
                //  end loop if you failed to guess a number after 3 try
                //part2
                //  fix if statements, check numbers correctly
            }

            System.out.println("You win the game");
            System.out.println("Number was " + randomNumber);
        }
    }
