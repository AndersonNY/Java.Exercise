package src.Day23;

public class Task1 {

    // write a java program that find maximum of two numbers

    public static void main(String[] args) {


        int a = 8;
        int b = 28;

        if (a > b) {

            System.out.println("It is the max: " + a);

        } else {
            System.out.println("max is :" + b);


        }

      //2.way

        int max= Math.max(a,b);
        System.out.println("max is: " + max);

//        Math.max()
//        Math.sqrt()
//        Math.random()
//        Math.abs()



        // 3.way

        int max2= (a>=b) ? a:b;

        System.out.println("max2 is "+ max2);


    }  }


