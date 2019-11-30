package src.Day20;

import java.util.HashMap;

public class HashMapTask5 {

    //5. Write a Java program to check whether a map
    //   contains key-value mappings (empty) or not.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        //ex: do we have key 3, print => Black,
        //                 else print => No we don't have

        if ((map.containsKey(3))) {
            System.out.println("Black");

        } else;

        System.out.println("Doesn't have");

        }

      //  part2  Check if you map is empty

//        map.clear();
//        if (map.isEmpty()) {
//        System.out.println("it is empty");
//    } else
//
//        System.out.println("it is not empty");
//    }
//
//        }











//    boolean havethree = false;   second way    part1
//        if (map.containsValue("Black")){
//        havethree = true;
//
//
//    }if (true){
//        System.out.println("Black");
//    }else {
//        System.out.println("no we dont have");}





    }

