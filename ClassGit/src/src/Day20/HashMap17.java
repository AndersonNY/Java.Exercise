package src.Day20;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap17 {

    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println(map);
        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);

        //part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500

        HashMap<String, Integer>map1 = new HashMap<>();

        if (map.containsKey("Apple")) {

            map.put("Apple", 500);

        }
        System.out.println(map);



        }
    }




