package src.Day19;

import java.util.ArrayList;

public class ArrayListTask3 {


    //3. Write a Java program to insert an element into the array list at the first position.


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Black");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Violet");
        arrayList.add(0, "White");

        for (String str : arrayList) {
            System.out.println(str);
        }


    }





}
