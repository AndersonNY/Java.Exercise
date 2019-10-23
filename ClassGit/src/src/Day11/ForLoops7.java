package src.Day11;

public class ForLoops7 {

    public static void main(String[] args) {


        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.println("i is: " + i);
            System.out.println("j is: " + j);
            System.out.println("k is: " + k);
        }

    }
    }


