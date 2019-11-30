package src.Day20;

import java.util.HashSet;

public class HashMapTask18 {

   //17. Count letters in string
    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
    // for ex:
    // A: 2
    // B: 1
    // ...
    //part 1
    // print every character in separate line

    //part2
    // put every character in HashSet

    //part3
    // put every character in HashMap<Character, Integer>

    //part4
    // when you are putting check if you have that letter already, if you have, increment value

    //part5
    //print HashMap

    // Part1

    public static void main(String[] args) {

     String a  = "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!";

        for (int i= 0; i<a.length(); i++) {

            System.out.println(a.charAt(i));

    }
        // ////  part2
        // //// put every character in HashSet


    // put every character in to one HashSet

        String sentence= "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS! ";
        HashSet<Character> mySet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char aChar = sentence.charAt(i);
            mySet.add(aChar);
        }
        System.out.println(mySet);
        
        
        
        //part3
        // put every character in HashMap<Character, Integer>, use value 0






    }

}
