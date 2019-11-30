package src.Day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTask11 {


    //11. Write a Java program to get a set view of the keys contained in this map.

    public static void main(String[] args) {

        HashMap<Character, Boolean>map = new HashMap<>();

        map.put('A',true);
        map.put('B',true);
        map.put('C',false);

        //print => A B C

       //  System.out.println(map.keySet()); second way



            //print => A B C
            Set<Character> characters = map.keySet();
            System.out.println(characters);

            for (Character character : characters) {
                System.out.println(character);
            }

            //
            for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
                Character key = entry.getKey();

                System.out.println("key is " + key);
            }
        }

}
