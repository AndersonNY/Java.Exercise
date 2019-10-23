package src.Day11;

import java.util.Scanner;

public class ForTask2 {

    //write a program which prints even numbers up to 10
    //ex: 0, 2, 4, 6, 8

    // hint:
    // if( x%2 ==0 ) => even
    // else => odd

    public static void main(String args[]) {
        int n = 10;
        System.out.print("Even Numbers from 0 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println("....................");

        // part2. continue part1, but use scanner to provide maximum loop iteration
// instead of 10 in part1, you should use provided number.

        Scanner scan = new Scanner(System.in);
        {


        }






    // Part2. Continue Part1, but use scanner to provide maximum loop iteration
    // instead of 10 in part1, you should use provided number.

    // Part3. Continue part2, but also provide starting number;

     //part 1
//        for(int i = 0; i < 10; i++){
//            if( i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------------------");

        //part 2
        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Provide max number: ");
//        int max = scan.nextInt();
//        for(int i = 0; i <= max; i++){
//            if( i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------------------");

        System.out.println("Provide min number: ");
        int min = scan.nextInt();
        System.out.println("Provide max number: ");
        int max = scan.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



