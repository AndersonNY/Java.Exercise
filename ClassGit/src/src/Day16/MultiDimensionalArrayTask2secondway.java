package src.Day16;

public class MultiDimensionalArrayTask2secondway {

     //TODO Using 2D Array fill the table of exam(examResult array)
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???
        //part1. give number
        //part2, print all results, USING NESTED LOOP
        //part3, assign random numbers to results
        public static void main(String[] args) {
            //part1
            int[][] examResult = {
                    {10, 40, 45},
                    {99, 88, 77, 90, 100}
            };
            //part2
            System.out.println(examResult[0].length);

            for (int row = 0; row < examResult.length; row++) {
                for (int col = 0; col < examResult[row].length; col++) {
                    System.out.print(examResult[row][col] + " ");
                }
                System.out.println();
            }



        }

    }
