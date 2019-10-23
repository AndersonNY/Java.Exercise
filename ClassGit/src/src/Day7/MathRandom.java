package src.Day7;

import java.sql.SQLOutput;

public class MathRandom {


    public static void main(String[] args) {
        //Random numbers in java use Math.random()
        System.out.println(Math.random()); // to print random

        int min = 1;
        int max = 10;
        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(randomInRange);

//        String v6 = "160.95";
//        double price = Double.valueOf(v6);
//        //range 1 - 10
//        double quantity = randomInRange;
//
//        boolean checkingPrice = price * quantity == 321.9;



        //TODO task1: print random integer number between 0 and 100

        double l = Math.random();
        int max2 = 100; // declaring integer max with value 10
        double r2 = l * max2; // gets random double between 0 - "max"
        int i2 = (int)r2; // gets integer form double
        System.out.println(r2); //printing double r1
        System.out.println(i2); //printing integer i1

//        System.out.println((int)(Math.random()*100));




        //task2: print 2 random numbers between 0 and 10;


    }

}

