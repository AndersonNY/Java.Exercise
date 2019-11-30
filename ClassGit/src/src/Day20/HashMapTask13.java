package src.Day20;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask13 {

     //13. calculate sum of items,
        //  size of map should be at least 5
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 100);
            map.put("Lemon", 200);
            map.put("Peach", 150);
            map.put("Melon", 145);
            map.put("Berry", 250);

            int sum = 0;
            for(Map.Entry<String, Integer> e : map.entrySet()){
                int price = e.getValue();

                sum += price;// sum = sum + price;
            }


            System.out.println("Sum items: " + sum);
        }
    }


