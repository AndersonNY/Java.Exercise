package src.day35;

public class Cake {

    // 2 attributes
    // int fruits
    // string color
    // create constructor (with 2 parameters)
    // create constructor (with 1 parameters)
    // cal main calls and print out the results
        //2 attributes
        int fruits;
        String color;

        //create constructor (with 2 parameters)
        public Cake(int numOfFruits, String myColor) {
            fruits = numOfFruits;
            color = myColor;
        }

        //create constructor (with 1 parameters)
        public Cake(int numOfFruits) {
            fruits = numOfFruits;
        }

        //call main calls and print out the results
        public static void main(String[] args) {
            Cake cake = new Cake(5, "pink");

            Cake cake2 = new Cake(5);

            System.out.println("Our cake has " + cake.fruits + " fruits and " + cake.color + " color");
        }
    }