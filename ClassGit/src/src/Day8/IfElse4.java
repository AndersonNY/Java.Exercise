package src.Day8;

import java.util.Scanner;

public class IfElse4 {


    public static void main(String[] args) {

        //write a program that print temperature in human readable words
        //ex: 70 => hot
            Scanner scan = new Scanner(System.in);

            //write a program that print temperature in human readable words
            //ex: 70 => hot
            System.out.println("Provide a temperature:");
            int temperature = scan.nextInt();
            if (temperature >= 70) { // 70<=t
                System.out.println("Hot");
            } else if (temperature < 70 && temperature >= 50) { // 50<=t<70
                System.out.println("Warm");
            } else if (temperature < 50 && temperature > 20) { //  20<t<50
                System.out.println("Cold");
            } else {
                System.out.println("Freezing");
            }
        }
    }


