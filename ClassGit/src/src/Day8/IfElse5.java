package src.Day8;

import java.util.Scanner;

public class IfElse5 {

        // byte -127 <-> 128
        // write a program check what
        // number DataType it is? (byte, short, int, long)
        // use scanner and if-else statements ,
        // 23 => byte
        // 12312 => short
        // 3147483647 => long
        // 123%@@34234 => Unknown dataType
        // TODO
        //  HINT: byte < short < int < long

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //int i = 12312,1213123; no "," in integer declaration
            //long l = 9223372036854775807L; //to make sure that you are providing long use L or l at the end of your number

            System.out.println("Write a number please:");
            long number = scan.nextLong();


            if (number >= -128 && number <= 127) {
                System.out.println("DataType is byte");
            } else if (number >= -32768 && number <= 32767) {
                System.out.println("DataType is short");
            } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("DataType is int");
            } else if (number >= -9223372036854775808L && number <= Long.MAX_VALUE) {
                System.out.println("DataType is long");
            }

        }
    }


