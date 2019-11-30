package src.Day19;

import java.util.ArrayList;

public class ArrayTask5 {


        //5. Write a Java program to update specific array element by given element.


        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("White");
            colors.add("Black");
            colors.add("Green");
            System.out.println(colors);

            //Hint:
            // Black => Blue

            colors.set(2,"Blue" );
            System.out.println(colors);


            // second way :
            // strng1.remove(1);
            //strng1.add(1,"Black");

        }
    }

