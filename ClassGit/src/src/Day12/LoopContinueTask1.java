package src.Day12;

public class LoopContinueTask1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            //TODO if number is even continue
            // else print that number

            // ex:3 => print "number is 3"
            //ex : 2 => continue;
            // Hint: number%2 ==0 => even

            // Write your code here

            if (i % 2 == 0) {

                System.out.println ("Iteration" + i);

                continue;

            } else {
                System.out.println(("Number is " + i));

            }

            // end of your code

            System.out.println(" Iteration" + i);

        }
    }}




