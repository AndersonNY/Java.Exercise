package src.Day11;

import java.util.Scanner;

public class ForEx3 {

    public static void main(String[] args) {


        // write a program with sum up to you provided number from 0
        // 5
        // 0+1+2+3+4+5 = > ???

        Scanner scan = new Scanner(System.in);

        System.out.println("provide a max number: ");
        int max = scan.nextInt();

        int sum = 0;

        int a = scan.nextInt();

        for (int i = 0; i <= max; i++) {

            //your code

            System.out.println(i);

            sum+=i; // sum= sum+i;



        }

    }

}

