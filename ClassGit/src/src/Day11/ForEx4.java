package src.Day11;

import java.util.Scanner;


// Part1
// Write a program with sum up to you provided number from 0
// 5
// 0 + 1 + 2 + 3 + 4 + 5 = > ???

    // part 2
// continue part 1, and get average
    class ForTask3 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Provide a max number: ");
            int max = s.nextInt();

            int sum = 0;
            int numbersInLoop = 0;
            for(int i = 0; i <= max; i++){
                //your code
                System.out.println(i);
                sum +=i; // sum = sum + i;

                numbersInLoop++;
            }

            //part 1
            System.out.println("Sum is " + sum);

            //part 2 is to get average
            System.out.println("average is " + ((double)sum/numbersInLoop));
        }
    }


