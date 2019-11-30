package src.Day19;

import java.util.ArrayList;

public class ArrayListTask4 {

        //4. Write a Java program to retrieve an element
        // (at a specified index) from a given array list.
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("White");
            colors.add("Black");
            colors.add("Green");
            System.out.println(colors);

            //write you code here
            // print third element in arrayList

            System.out.println("third element in arrayList: " + colors.get(2));

        }
    }


