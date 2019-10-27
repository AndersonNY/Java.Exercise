package src.Day15;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {


        //TODO
        // part1. fill array with random values using Random/Math.random, 0 <= random N <= 10
        // part2. check if an array of has 0, print => "it has zero"
        // part3. check if array has 10, print => "it has 10"
        // part4. if array has 0 or 10, print the indices(indexes) of them
        // ex:  31 90 0 123 4  0
        //  it has zero
        //  it has zero
        public static void main(String[] args) {
            Random random = new Random();

            int[] arrayWithRandomNumbers = new int[10];
            //part1
            System.out.println("PART1-----------------------------");
            for (int index = 0; index < arrayWithRandomNumbers.length; index++) {
                arrayWithRandomNumbers[index] = random.nextInt(11);
                System.out.print(arrayWithRandomNumbers[index] + " ");
            }

            //part2
            System.out.println("\nPART2-----------------------------");
            for (int index = 0; index < arrayWithRandomNumbers.length; index++) {
                if (arrayWithRandomNumbers[index] == 0) {
                    System.out.println("it has zero, and index is:" + index);
                    //part3
                } else if (arrayWithRandomNumbers[index] == 10) {
                    System.out.println("it has ten, and index is:" + index);
                }
            }
        }
    }



