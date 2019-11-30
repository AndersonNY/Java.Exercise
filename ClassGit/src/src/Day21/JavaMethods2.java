package src.Day21;

import java.util.Scanner;

public class JavaMethods2 {


//
//    2. Write a Java method to compute the average of three numbers. Go to the editor
//    Test Data:
//    Input the first number: 25
//    Input the second number: 45
//    Input the third number: 65
//    Expected Output:
//
//    The average value is 45.0
public static void main(String[] args) {
    //do not use void, but return the value from your method
    double[] nums = new double[3];
    Scanner in = new Scanner(System.in);
    System.out.print(" first number: ");
    nums[1] = in.nextDouble();
    System.out.print("second number: ");
    nums[2] = in.nextDouble();
    System.out.print("third number: ");
    nums[3] = in.nextDouble();


    System.out.print("The average value is " + average(nums));
}

    public static double average(double[] numbers) {
        if (numbers.length == 0) return 0.0;

        int sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}