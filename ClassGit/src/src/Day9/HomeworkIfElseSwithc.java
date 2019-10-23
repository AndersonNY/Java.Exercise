package src.Day9;

public class HomeworkIfElseSwithc {


    //   class MainClass {
        public static void main(String[] args)
        {
            int x = 10;
            final int y = 20;
            switch (x) {
                case 10:
                    System.out.println("HELLO");
                    break;
                case y:
                    System.out.println("TECHNO");
                    break;

                    // because we use to final case y is not giving error otherwise case y will give an error.

            }
        }
    }
////Options:
////1. TECHNO
////2. Compile time error
////3. HELLO
////4. NO Output

