package src.Day15;

public class ReverseLoop {

     public static void main(String[] args) {
            System.out.println("normal");
            int[] myIntArray = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
            }
            //shortcuts in InteliJ IDEA
            //arr.for, gives for-each loop
            for (int i : myIntArray) {

            }
            //arr.fori, gives for loop starting with 0 index to last index
            for (int i = 0; i < myIntArray.length; i++) {

            }
            //arr.forr, gives reverse loop starting from last index to 0
            for (int i = myIntArray.length - 1; i >= 0; i--) {


                // for (int i = myIntArray.length - 1; i>=0; i--

                // System.out.println("\nreverse");

                // for (int i =

            }

            System.out.println("\nreverse");
            for (int i = 4; i >= 0; i--) {
                System.out.print(i + " ");
            }


        }
    }
