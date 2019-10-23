package src.Day12;

public class LoopBreak {


        public static void main(String[] args) {
            int number = 0;
            for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
                if (i == 5) {
                    number = i;
                    break;
                }
            }
            System.out.println("Your number is " + number);

            // part1
            // run loop up to 100000000'
            // and exit that loop when i is equal to 232558


        }


}
