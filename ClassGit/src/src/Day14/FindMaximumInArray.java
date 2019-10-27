package src.Day14;

public class FindMaximumInArray {

        public static void main(String[] args) {

            int[] myArray = {2, 11, 45, 9, 56};
            // 0   1   2   3  4

            //i starts with 0 as array index starts with 0 too
            int max = 0;
            //the task is to find and print out the maximum element
            for (int i = 0; i < myArray.length; i++) {

//            System.out.println(myArray[i]);
                int value = myArray[i];

                //myArray[i] = 2 and max = 0
                if (myArray[i] > max)
                    max = myArray[i];
            }

            System.out.println(max);

        }
    }
