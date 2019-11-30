package src.Day22;

import org.w3c.dom.ls.LSOutput;

public class Task2Array {

    // 2. Write a Java program to sum values of an array.

    public static void main(String[] args) {


    int[] arr = {2, 5, 8, 10, 12};

    int sum = 0;

    for(int number :arr) {
        sum= sum+number; // 0+3

    }

    System.out.println(sum);

} }

    // 2. Write a Java program to sum values of an array.
  //  public static void main(String[] args) {
//        int[] array = {10, 10, 10};
  //      1.way.  for
//        int sum1 = 0;
//        for (int number : array) {
//            sum1 = sum1 + number;
//            sum1 += number;
//        }
//        System.out.println(sum1);
 //       2.way.  fori -> using for(int i = 0)
//        int sum2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            int number = array[i];
//            sum2 += number;
//        }
//        System.out.println(sum2);
 //       3.way.  forr -> using for(int i = array.length-1), from reverse
//        int sum3 = 0;
//        for (int i = array.length - 1; i >= 0; i--){
//            int number = array[i];
//            sum3 += number;
//        }
//        System.out.println(sum3);
//
//        if(sum1 == sum2 && sum1 == sum3){
//            System.out.println("they are equal");
//        }
//
//    }
//}
//