package src.Day21;

import java.util.HashMap;

public class CheckBeforePutValue {

     // put only 'h' letter as keys into your HashMap,
        // constraints: YOU HAVE TO USE IF STATEMENT
        //              put value = 0
        // HINT: use if statement
        public static void main(String[] args) {
            String sentence = "jonny hello asd";

            HashMap<Character, Integer> letterMap = new HashMap<>();

            char[] sentenceArray = sentence.toCharArray();
            for (char letter : sentenceArray) {
                if(letter == 'h') {
                    letterMap.put(letter, 0);
                }
            }

            System.out.println(letterMap);
            // {h=0}
        }
    }
