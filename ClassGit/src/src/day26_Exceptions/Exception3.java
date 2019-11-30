package src.day26_Exceptions;

public class Exception3 {

    public static void main(String[] args) {
        // array of size 4.

        int[] arr = new int[4]; // arr: {0, 0, 0, 0}
        // this statement cause an execption
        int i = arr[4]; //arr: {0, 0, 0, 0}

        // the following statement will never execute
        System.out.println("Hi, I want to execute");


        // What does success look like in this position, and how do you measure it
        // very good question in interview we should ask to them...
    }}



