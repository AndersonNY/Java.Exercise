package src.Day20;

import java.util.HashMap;

public class HashMapTask4 {


        //4. Write a Java program to remove all
        //   of the mappings from a map.

        public static void main(String[] args) {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Red");
            map.put(2, "Green");
            map.put(3, "Black");
            map.put(4, "White");
            map.put(5, "Blue");

            {

                map.clear();


            }


            System.out.println("Size of map is: " + map.size());

        }
    }




