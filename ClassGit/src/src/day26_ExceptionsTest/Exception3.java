package src.day26_ExceptionsTest;

public class Exception3 {


    static ArithmeticException ae = new ArithmeticException();

    public static void main(String[] args) {
        throw ae;
    }
////Options: Answer
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//

}
