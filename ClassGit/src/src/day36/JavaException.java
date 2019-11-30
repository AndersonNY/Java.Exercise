package src.day36;

public class JavaException {

        //Java Exceptions: Exception types and try, catch, finally

        public static void main(String[] args) {
            int result = -1; // no result
            try {
                result = 10 / 0;
            } catch (Exception ex) {
                System.out.println("hey don't you know math?");
//            ex.printStackTrace();
            } finally {
                System.out.println("Result is: " + result);
            }

            System.out.println("THE END OF APPLICATION !!!");

        }
    }
