package src.Day12;

public class While {

        public static void main(String[] args) {
            System.out.println("FOR -----------------------");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
            System.out.println("BAD FOR, DONT USE LIKE THIS");
            int k = 1;
            for (; k <= 5; ) {
                System.out.println(k);
                k++;
            }

            System.out.println("WHILE -----------------------");
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j = j + 1;
            }

            System.out.println("DO-WHILE -----------------------");
            int m = 1;
            do {
                System.out.println(m);
                m++;
            } while (m <= 5);

        }
    }
