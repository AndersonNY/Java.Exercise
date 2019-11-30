package src.Day23;

public class Task3 {

    //    Write a Java program to find the largest element in an array.
    // {1,34,66,1000,23,4,7,9} => 1000

    public static void main(String[] args) {


  //      int[] num = {1, 34, 66, 1000, 23, 4, 7, 9};

    //    int max = 0;

      //  for (int i = 0; i < num.length; i++) {
          //  if (num[i] > max) {
        //        max = num[i];

       //     }

         //   System.out.println("The largest number is: " + max);

  //      }

        //2.way

        int[] number = {1, 34, 66, 1000, 23, 4, 7, 9};

        int max1 = Integer.MIN_VALUE;

        for (int i : number) {
            if (i > max1) {
                max1 = i;


            }

        } System.out.println("maximum is " + max1);



    }




}






