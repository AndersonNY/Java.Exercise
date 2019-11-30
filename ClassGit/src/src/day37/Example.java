package src.day37;

public class Example {

    static class MyInteger {

        private MyInteger() {
        }

        public static int valueOf(String s) {
            // custom code
            return Integer.valueOf(s);
        }

        public static MyInteger getMe(/**/) {
            //some checking before creating object
            MyInteger myInt = new MyInteger();
            return  myInt;
        }

    }

    public static class Ex2 {

        public static void main(String[] args) {
//        MyInteger myInt = new MyInteger(); cannot create object because of private constructor
//        MyInteger a = new MyInteger();
            int a = MyInteger.valueOf("10");


            MyInteger myInteger = MyInteger.getMe();
        }

    } }