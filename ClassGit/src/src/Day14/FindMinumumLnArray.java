package src.Day14;

public class FindMinumumLnArray {


        //the task is to find and print out the minimum element
        public static void main(String[] args) {

            // both are valid declarations
//        int myName[];
            //or
            int[] myName = {2344, 34546, 3456, 2324, 34567, 47, 235, 34546, 466, 346, 34, 346};
            int[] myName1 = new int[]{2344, 34546, 3456, 2324, 34567, 47, 235, 34546, 466, 346, 34, 346};

            int myValue = myName1[5];

            byte[] byteArray;
            short shortsArray[];
            boolean[] booleanArray = {false, true, false, true};
            long longArray[];
            float floatArray[];
            double doubleArray[];
            char[] charArray = {'a', 'b'};

// an array of references to objects of
// the class MyClass (a class created by
// user)


            int[] myArray = {34, 2, 11, 45, 9, 56};

            //same way to declare an array.
            int[] array = new int[6];
            array[0] = 34;
            array[1] = 2;
            array[2] = 11;
            array[3] = 45;
            array[4] = 9;
            array[5] = 56;

            // 0   1   2   3  4
            int min = myArray[4];
            for (int i = 0; i < myArray.length; i++) {

                //     System.out.println(myArray[i]);
                //min = 34;
                // 34<34, min = 34
                // 2<34, min = 2
                //11<2, min = 2
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
            System.out.println(min);
        }
    }


