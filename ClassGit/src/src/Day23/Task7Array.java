package src.Day23;

import java.util.ArrayList;
import java.util.HashSet;

public class Task7Array {



    // Given arrayList of chars
    // print true if they have repetitive letters
    // {'A','B','B'} => true
    // {'C','D'} => false

    public static void main(String[] args) {
        ArrayList<Character> letterList = new ArrayList<>();
        letterList.add('C');
//        letterList.add('D');
//        letterList.add('e');
//        letterList.add('D');
//        letterList.add('B');

        // 1way. sets
        HashSet<Character> letterSet = new HashSet<>();
        for (Character letter : letterList) {
            letterSet.add(letter);
        }

        System.out.println(letterList);
        System.out.println(letterSet);
        if(letterList.size() == letterSet.size()){
            System.out.println("we dont have repetition: " + false);
        }else {
            System.out.println("we have repetition: " + true);
        }

        // 2way. nested loop
        // 3way. indexes
    }



}
