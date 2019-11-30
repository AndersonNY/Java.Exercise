package src.Day20;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask15 {


            //15. given map, print it like this:
            // Apple 100
            // Lemon 200
            // Peach 150
            // Melon 145
            // Berry 250
            public static void main(String[] args) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("Apple", 100);
                map.put("Lemon", 200);
                map.put("Peach", 150);
                map.put("Melon", 145);
                map.put("Berry", 250);

                for (Map.Entry<String, Integer> row : map.entrySet()) {
                    String key = row.getKey();
                    Integer value = row.getValue();
                    System.out.println(key + " " + value);
                }
            }
        }



        // for (Map.Entry<String, Integer> row : map.entrySet()) {


   //    String key= row. getKey();
    // Integer value = row.getValue();
