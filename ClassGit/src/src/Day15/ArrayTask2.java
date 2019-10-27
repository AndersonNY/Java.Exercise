package src.Day15;

import java.util.Scanner;

public class ArrayTask2 {
    //TODO
    //part1. using scanner fill array of length 10;
    //part2. print reverse of you array
    // 1 2 3 4 5 6 7 8 9 10
    // 10 9 8 7 6 5 4 3 2 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //HINT Part1:
        // create array with 10 length
        // you can assign all ten value in 10 lines or use loop for it
        // use scan.nextInt(); to get number
        int[] arr = new int[10];
//        arr[0] = scan.nextInt();
//        arr[1] = scan.nextInt();
//        arr[2] = scan.nextInt();
//        arr[3] = scan.nextInt();
//        arr[4] = scan.nextInt();
//        arr[5] = scan.nextInt();
//        arr[6] = scan.nextInt();
//        arr[7] = scan.nextInt();
//        arr[8] = scan.nextInt();
//        arr[9] = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Provide number " + i);
            arr[i] = scan.nextInt();
        }

        //HINT Part2:
        // start from length()-1
        // use i-- to decrement


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


            //HINT Part2:
            // start from length()-1
            // use i-- to decrement
            System.out.println("Array Length: " + arr.length);

            // 0: 10
            // 1: 20
            // 2: 30
            System.out.println("reverse");
            // assume array length is 3
            // and index: 0 1 2
            // reverse: 2 1 0
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
                // i = 2; arr[2]
                // i = 1; arr[1]
                // i = 0; arr[0]
                // i = -1; exit the loop
            }
        }
    }










