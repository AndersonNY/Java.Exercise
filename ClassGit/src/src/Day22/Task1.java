package src.Day22;

import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {

        //Write a Java program to sort a numeric array and a string array.

        int [] s1 = {1,2,4,50,12,14};

        String [] names = {"Sezai", "Sitki", "Ihsan"};

        System.out.println("First Numeric array: " +Arrays.toString(s1));

        Arrays.sort(s1);

        System.out.println("Sorted Numeric array: " + Arrays.toString(s1));

        System.out.println("First String array: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("Sorted String array: "+ Arrays.toString(names));



    }




}
