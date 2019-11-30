package src.Day16;

public class MultiDimensionalArrayTask2 {

    //TODO Using 2D Array fill the table of exam
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

        ///part1. give number

         /// print all results, using nested loop

    public static void main(String[] args) {
        int[][] examResult = {
                {10, 40, 45},
                {99, 88, 77}
        };


        // part 2

        for (int max = 0; max < 2; max++) {
            for (int bayram = 0; bayram < 2; bayram ++) {

                System.out.println("exam Result: " + examResult[max][bayram]);


            }
        }} }



