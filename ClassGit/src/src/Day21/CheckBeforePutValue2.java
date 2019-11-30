package src.Day21;

import java.util.HashMap;

public class CheckBeforePutValue2 {

        // put letters in your map, value = 0
        // if map contains that letter already print => "I have it"

        // Hint: .containsKey() method
        public static void main(String[] args) {
            String sentence = "hello";
            HashMap<Character, Integer> letterMap = new HashMap<>();
            char[] sentenceArray = sentence.toCharArray();
            System.out.println(sentenceArray);
            for (char letter : sentenceArray) {
                if (letterMap.containsKey(letter)) {
                    System.out.println("i have it");
                } else {
                    letterMap.put(letter, 0);
                }
                System.out.println(letterMap);
            }
        }
    }