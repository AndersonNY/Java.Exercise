package src.Day21;

import java.util.HashMap;

public class PutValue {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String sentence = "ABC";
        char[] chars = sentence.toCharArray();//sentence.toCharArray() => ['A', 'B',' C']
        for (char c : chars) {
            //write you code here

            map.put(c, 0);

        }

        System.out.print(map);


        //end of you code}
        //output:
        // {'A'=0, 'B'=0, 'C'=0}

    }

}
