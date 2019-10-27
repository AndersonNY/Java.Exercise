package src.Day15;

import java.util.Random;

public class ArrayTask1 {



    //TODO Task
        // part1. fill array with random values using Random/Math.random,
        //        where length of array is 10 <= array.length <= 100
        // part2. find average of array;
        //  ex: [1, 5, 6, 8] => 20/4 => 5
        public static void main(String[] args) {
            Random rand = new Random();
            // part1.
            // create array with size 10 <= size <= 100
            // use loop to get access for every element i n array
            // use rand.nextInt(1000) to assign random number to every element in array
            int[] arr = new int[10];
            // type variable name, press dot, select fori form popup,
            // to create for with shortcut
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
//            arr[i] =  (int) (Math.random() * 100);
                arr[i] = rand.nextInt(100);
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }

            double avg = (double) sum / arr.length;
            System.out.println("\nAvg: " + avg);
        }
    }



