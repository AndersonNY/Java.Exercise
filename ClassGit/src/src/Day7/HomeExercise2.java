package src.Day7;

public class HomeExercise2 {

    public static void main(String[] args) {

        int min = 0;
        int max = 5;

        int range = max-min;

        int randomInRange = min + (int) (Math.random() * ((max-min)));

            // int randomInRange = min + (int) (Math.random() * ((max-min)));

        int min2 = 10;
        int max2 = 20;

        int range2 = max2 - min2;

        int randomInRange2 = min2 + (int) (Math.random() * (range2+1));

        int x= randomInRange2;

        System.out.println(x);

        if (x % 2 ==0) {
            System.out.println("The number is even");
        }

         else  {
             System.out.println("The number is odd");
        }
        }
    }

