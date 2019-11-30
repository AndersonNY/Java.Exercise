package src.day38;



    // Write a program that will count every time when you create an object and print it
// HINT: create class Counter with attribute [int count = 0]
// increment value of count in default constructor of Counter

    class Counter {
        //write you code here
        //end of code

     private int count = 0;

        public  Counter () {

            count ++;

            System.out.println("default Constructor");
            System.out.println("Count is : " + count);
        }
    }


    public class Task {

        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
        }

}



