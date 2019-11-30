package src.Day21;

import java.util.HashMap;

public class PutValue3 {

    // Put first names and last names into your map, and print
        // Put first names and last names into your map, and print
        // Put first names and last names into your map, and print
        public static void main(String[] args) {
            //                      0      1        2       3
            String[] firstNames = {"Max", "Drake", "Susan", "Alie"};
            String[] lastNames = {"Smith", "Jones", "Miller", "Brown"};
            //write you code here
            HashMap<String, String> people = new HashMap<>();
            for (int i = 0; i < 3; i++) {// 0 1 2
//            System.out.print(firstNames[i] + "=" + lastNames[i]);
                String key = firstNames[i];
                String value = lastNames[i];
                people.put(key, value);
            }
            //end of you code
            System.out.println(people);
            //output:
            //{Max=Smith, Drake=Jones, Susan=Miller}
        }
    }