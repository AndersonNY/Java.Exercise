package src.Day21;

import java.util.HashMap;

public class ConcatValue {

    // Given map, concatenate map values each time of iteration

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "b");

        for (int i = 0; i < 3; i++) {
            System.out.println(map);
            //write you code here

                //write you code here

            String value= map.get ("A");

            map.put("A", value + "b");

            //end of you code
        }
        //output:
        // {"A"="b"}
        // {"A"="bb"}
        // {"A"="bbb"}
    }

}
