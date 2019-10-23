package src.Day7;

public class MathRandom3 {

    //Task2: print 2 random integer numbers between 0 and 10;
    //ex1:
    //    4
    //    5
    //ex2:
    //    1
    //    2


    public static void main(String[] args) {
            // 1. way
            System.out.println((int) (Math.random() * 10));
            System.out.println((int) (Math.random() * 10));

            System.out.println("-----------------------------------------");
            // 2. way
            int max = 10;

            double r1 = Math.random() * max;
            int i1 = (int) r1; // gets integer form double
            System.out.println(i1);

            double r2 = Math.random() * max;
            int i2 = (int) r2; // gets integer form double
            System.out.println(i2);
        }


    }

