package src.Day14;

public class ArrayForLoops {

     public static void main(String[] args) {
            int[] arr1 = {2, 11, 45, 9};

            int[] arr2 = new int[4];
            arr2[0] = 2;
            arr2[1] = 11;
            arr2[2] = 45;
            arr2[3] = 9;

            for (int num : arr1) { // {2, 11, 45, 9}
                System.out.println(num);
                //1. num = 2;
                //2. num = 11;
                //3. num = 45;
                //4. num = 9;
            }

            System.out.println();


            for (int i = 0; i < arr1.length; i++) {
                // 0 1 2 3
                System.out.println("arr1:" + arr1[i]);
                System.out.println("arr2:" + arr2[i]);
            }

            System.out.println("-----------------");
            String[] words = {"Name", "Age", "Laptop"};
            for(String word : words){
                System.out.println(word);
                //1. word = "Name"
                //2. word = "Age"
                //3. word = "Laptop"
            }

            System.out.println("-----------------");

            char[] chars = {'A', 'B', 'C', 'D', 'E'};
            for(char c : chars){
                System.out.println(c);
            }

        }
    }
