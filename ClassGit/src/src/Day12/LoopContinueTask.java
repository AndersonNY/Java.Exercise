package src.Day12;

public class LoopContinueTask {

     //TODO if number is even continue
        //     else print that number
        //ex: 3 => print "number is 3"
        //ex: 2 => continue;
        //Hint: i%2==0 => even

        //write you code here
        //you code goes here


        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Start of iteration " + i);
                if (i < 3) {
                    continue;
                }
                //end of you code
                System.out.println("End of iteration " + i);
            }
        }
    }
