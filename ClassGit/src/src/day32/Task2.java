package src.day32;

import java.util.ArrayList;

public class Task2 {


    // Write a program with a method named printSum
    // that accepts ArrayList of integers as an argument and print its sum.

    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(4);
        firstList.add(90);
        firstList.add(10);
        firstList.add(5);

        printSum(firstList);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(90);
        secondList.add(10);
        secondList.add(5);

        printSum(secondList);


        ArrayList<Integer> thirdList = new ArrayList<>();
        thirdList.add(10);
        thirdList.add(100);
        printSum(thirdList);

    }

    public static void printSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("Sum is:" + sum);
    } }
