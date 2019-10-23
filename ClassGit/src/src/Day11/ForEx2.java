package src.Day11;

import java.util.Scanner;

public class ForEx2 {

    public static void main(String[] args) {


        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i = i + 3) {
            System.out.println(i);
            sum += i; // same as sum = sum + i;
            counter++; // same as counter = counter + 1;
        }

        System.out.println("sum from 1 to 10 with +3 is " + sum);
        System.out.println("counter is " + counter);

        System.out.println((double) sum / counter);

    }

    {

        //part3

        // write a program with sum up to you provided number from 0
        // 5
        // 0+1+2+3+4+5 = > ???

        Scanner scan = new Scanner (System.in);

        System.out.println("Provide a number: ");

        int a = scan.nextInt();

        System.out.println("Provide b number");

        int b = scan.nextInt();


        for (int i =1; i <= 5; i++) {


        }


}
}
