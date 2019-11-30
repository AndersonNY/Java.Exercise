package src.Day20;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask8 {
    //8. Write a Java program to test if a
    //   map contains a mapping for the specified value.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("map 1: " + map);


        String value = "Peach";
        if (map.containsValue(value)) {
            System.out.println("it has :" + map.containsValue(value));
        } else {
            System.out.println("it doesn't have");
        }
    } }




    //part2, try to check it using loop, without .containsValue method
    //       print key if you have value in map

  //  {

//     boolean hasPineapple = false;

  //   for (Map.Entry<Integer,String > entry: map.entrySet());








//    boolean hasPineapple = false;
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//        Integer entryKey = entry.getKey();
//        String entryValue = entry.getValue();
//
//        if (entryValue.equals("Pineapple")) {
//            hasPineapple = true;
//        }
//    }
//
//        if(hasPineapple){
//        System.out.println("has it");
//    }else {
//        System.out.println("dont have");
//    }
//
//}
//}



