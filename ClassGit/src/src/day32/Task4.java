package src.day32;

import java.util.ArrayList;

public class Task4 {
       // Write a program with a method named getSum
        // that accepts ArrayList of integers as an argument and print its sum in main.

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);
        int sum = getSum(myList);

        System.out.println(sum);

    }
    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (Integer number : list) {
            sum += number;

        }

        return sum;
    }


}
