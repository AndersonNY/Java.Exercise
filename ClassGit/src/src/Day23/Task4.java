package src.Day23;

public class Task4 {


    //    Write a Java program to find the smallest element in an array.
//    {1,34,66,1000,23,4,7,9} => 1

    public static void main(String[] args) {


        int[] number = {1, 34, 66, 1000, 23, 4, 7, 9};

        int min = Integer.MAX_VALUE;

        for (int i : number) {
            if (i < min) {
                min = i;


            }

        } System.out.println("The smallest number is  " + min);



  //2.way
  //        int a[] = {2, 5, 3, 1, 8};
  //        Arrays.sort(a);
 //        int min = a[0];
//        System.out.println(min)

    }
}


