package src.day32;

import java.util.ArrayList;

public class JavaVoidMethods {

    public static void main(String[] args) {
        printTechno(); // without parameters
        printText("My super String"); // without parameters

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);

//        ArrayList<String> myList2 = new ArrayList<>();
        printArrayList(myList);
    }

    public static void printTechno() {
        System.out.println("Techno");
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printArrayList(ArrayList<Integer> numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
