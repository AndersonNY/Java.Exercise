package src.Day21;

import java.util.HashMap;

public class PutValue4 {

         // put letters as keys into your HashMap,
        // put value = 0
        public static void main(String[] args) {
            String sentence = "hello";
            //{h=0,e=0,l=0,o=0}

                HashMap<Character, Integer> letterMap = new HashMap<>();

                char[] sentenceArray = sentence.toCharArray();
                for (char letter : sentenceArray) {
                    letterMap.put(letter, 0);
                }
                System.out.println(letterMap);
            }
        }





