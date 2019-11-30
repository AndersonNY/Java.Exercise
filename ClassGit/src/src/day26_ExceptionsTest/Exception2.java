package src.day26_ExceptionsTest;

public class Exception2 {

        public static void main(String[] args) {
            int x = 1;
            int y = 0;

            try {
                int result = computeDivision(x, y);
            }
            // matching ArithmeticException
            catch (ArithmeticException ex) {
                // getMessage will print description of exception(here / by zero)
                System.out.println(ex.getMessage());
            }
        }

        private static int computeDivision(int x, int y) {
            int result = x / y;
            return result;
        }
    }