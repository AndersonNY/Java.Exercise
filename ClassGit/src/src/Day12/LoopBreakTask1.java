package src.Day12;

public class LoopBreakTask1 {

    // part1, run loop up to 100000000,
    // and exit that loop when i is equal to 232558

    // part2, continue part1, but instead of 232558 use some random number
    // using random generator, Math.random, Random
    public static void main(String[] args) {
        int number = -1;
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("----------------");
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);
    }
}

