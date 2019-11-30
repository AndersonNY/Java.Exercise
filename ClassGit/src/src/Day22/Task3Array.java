package src.Day22;

public class Task3Array {


//    Write a Java program to print the grid of zeros with length m and n.

    //create a 2D array

    // hint : user nested loop to print zeros

    public static void main(String[] args) {
        int m = 1000;
        int n = 100;

        int[][] array = new int[m][n];

        for (int i = 0; i < array.length;  i++) {

            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array [i][j]);
            }

        }

        }

}