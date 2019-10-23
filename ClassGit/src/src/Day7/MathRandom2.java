package src.Day7;

import java.sql.SQLOutput;

public class MathRandom2 {

// taks2: print 2 random numbers between 0 and 10;

    // ex:4
    //    5


    public static void main (String[]args) {
        double random = Math.random();

        int max1= 10;

        System.out.println(random);

        double random2 = Math.random();

        System.out.println(random2);

        //To get random number between 0 and N, multiply Math.random() with N
        //formula: Math.random()*N, where N is integer


                double d1 = Math.random();
                System.out.println(d1);
                System.out.println(d1 * 10);
                int i1 = (int) (d1 * 10);
                System.out.println(i1);

                System.out.println("---------------");
                //0 - 1000
                System.out.println((Math.random()*1000));

                //sample
                // 0.2 * 10 => 2
                //

            }

        }
















