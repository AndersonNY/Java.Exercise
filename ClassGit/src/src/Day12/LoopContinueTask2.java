package src.Day12;

public class LoopContinueTask2 {

    //write a program that iterates from 0 to 10
    // but only prints numbers which
    // are greater than 4 and less than 8
    // you MUST use continue


    public static void main(String[] args) {
        //part 1. write a program that iterates from 0 to 10
        // but only prints numbers which are greater than 4 and less than 8
        // 4 5 6 7 8
        // you MUST use continue

            for (int i = 0; i <= 10; i++) {
                //actual code in production
                if (i > 4 && i < 8) {
                    System.out.println(i);
                }

                //to teach continue
                if (i <= 4 || i >= 8) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

