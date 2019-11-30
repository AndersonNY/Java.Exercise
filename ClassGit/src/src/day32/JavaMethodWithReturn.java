package src.day32;

public class JavaMethodWithReturn {


    public static void main(String[] args) {
//        int sum = sum(10, 20, 30);
//        double average = average(sum, 3);
//
//        System.out.println("sum of three is: " + sum);
//        System.out.println("average of three is: " + average);

        Character letter = giveMeLetter("Techno", 0);
        System.out.println(letter);


    }

    public static Character giveMeLetter(String text, int index) {
        return text.charAt(index);
    }

    public static double average(int sum, int size) {
        double average = (double) sum / size;
        return average;
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }


    // return for void methods
    public static void buyStuffFromStore() {
        boolean dontHaveMilk = true;
        if (dontHaveMilk) {
            System.out.println("I'll to go to other store");
            return;
        }

        System.out.println("buy milk");
        System.out.println("buy bread");
        System.out.println("buy water");
    }

}
