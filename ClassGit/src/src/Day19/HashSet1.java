package src.Day19;

import java.util.ArrayList;

public class HashSet1 {

        public static void main(String[] args) {
            int[] array = new int[5];
            int length = array.length;
            int firstValue = array[0];
            array[0] = 100;

            ArrayList<Integer> arrayList = new ArrayList();
            int arrayListLength = arrayList.size(); // to get size
            arrayList.add(10);// too add value
            arrayList.add(20);
            arrayList.add(30);

            System.out.println("Before set");
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }
            int firstValueList = arrayList.get(0);
            arrayList.set(0, 100);
            System.out.println("\nAfter set");
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }

            boolean contains40 = arrayList.contains(40);
            if(contains40){
                System.out.println("\nIt has 40");
            }else {
                System.out.println("\nIt doest have 40");
            }

            arrayList.add(0, 2000);
            System.out.println("\nAfter adding to the beginning");
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }

        }

}


