package src.Exercise;

public class ArrayTest {

        //    What is the output of this question
        public static void main(String[] args) {
            int arr[] = {11, 22, 33};
            System.out.print(arr[-2]);
        }
//    Option
//    A) 11 33
//    B) Error
//    C) exception (ANSWER)
//    D) 11 -33

        //    What is the output of this question?
        public static void main2(String[] args) {
            int arr[][] = {{11, 22}, {33, 44, 55}};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < arr.length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
//    Option
//    A) 11 22
//            33 44 55
//    B) 11 22
//            33 44
//    C) Error
//    D) Exception  (ANSWER IF WE PUT 3 INSTED OF 2)

        //What is the output of this question?
        public static void main3(String[] args) {
            int arr[][] = {{11, 22}, {33, 44, 55}};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
//    Option
//    A) 11 22      (ANSWER)
//            33 44 55
//    B) 11 22
//            33 44
//    C) Exception
//    D) Error

        //    What is the output of this question ?
        public static void main4(String[] args) {
            int arr[][] = {{11, 22}, {33, 44, 55}};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }

        //    Option
//    A) 11 22
//            33 44 55
//    B) 11 22
//            33 44
//    C) Error
//    D) Exception
//What is the output of this question?
//    public static void main6(String[] args) {
//        int arr[] = new int[5];
//        int arr2[] = new int[5];
//        System.out.print(arr.length + " ");
//        System.out.print(arr2.length());
//    }
//    Option
//    A) 5 5
//    B) Error  (ANSWER)
//    C) Exception
//    D) None

        //    What is the output of this question?
        public static void main6(String[] args) {
            int arr[] = new int[5];
            int arr2[] = new int['a'];
            byte bt = 10;
            int arr3[] = new int[bt];
            System.out.println(arr.length);
            System.out.println(arr2.length);
            System.out.println(arr3.length);
        }
//    Option
//    A) Error
//    B) Runtime Exception
//    C) 5
//            97
//            10
//    D) 5
//            65
//            10

        //What is the output of this question?
//    public static void main7(String[] args) {
//        int a[] = new int[5]; // line 1
//        int[] a11 = new int[]; // line 2
//    }
//    Option
//    A) Error
//    B) Exception
//    C) Run successfully
//    D) None

//        public static void main8(String[] args)
//        {
//            int[][] arr1 = new int[2][3]; // Line 1
//            int[][] arr2 = new int[2][]; // line 2
//            int[][] arr3 = new int[][]; // line 3
//            int[][] arr4 = new int[][2]; // line 4
//        }
//    Option
//    A) All
//    B) line 1, 3, 4
//    C) line 3, 4
//    D) line 2, 3, 4

        //        public static void main8(String[] args)
//        {
//            int[][][] arr1 = new int[1][2][3]; // Line 1
//            int[][][] arr2 = new int[1][2][]; // Line 2
//            int[][][] arr3 = new int[2][][]; // Line 3
//            int[][][] arr4 = new int[][][]; // Line 4
//            int[][][] arr5 = new int[][2][3]; // Line 5
//            int[][][] arr6 = new int[][][3]; // Line 6
//            int[][][] arr7 = new int[][2][]; // Line 7
//        }
//    Option
//    A) line 4, 5, 6, 7
//    B) All
//    C) No Error
//    D) line 4, 7
//
        public static void main9(String[] args) {
            int arr[] = new int[5];
            System.out.println(arr);
            System.out.println(arr[0]);
        }
//    Option
//    A) 0
//            0
//    B)[I@6bc7c054
//0
//    C) 0 0 0 0 0
//            0
//    D) none

//        static void main10(String[] args)
//        {
//            int arr[] = { 11, 22, 33 };
//            for (int i = 0; i < arr.length; i++)
//                System.out.print(arr[i] + " ");
//
//            System.out.println();
//
//            int arr2[] = new int[3];
//            arr2[] = { 11, 22, 33 };
//            for (int i = 0; i < arr2.length; i++)
//                System.out.print(arr2[i] + " ");
//        }
//    Option
//    A) 11 22 33
//            11 22 33
//    B) Error
//    C) Exception
//    D) None

        static void main11(String[] args)
        {
            String str[] = { "Techno", "for", "Techno" };
            for (int i = 0; i < str.length; i++)
                System.out.print(str[i]);
        }
//    A)TechnoforTechno
//    B)Error
//    C)Techno
//    D)GfG

//        static void main12(String[] args)
//        {
//            String str[] = { "Techno", "for", "Techno" };
//            System.out.println(str.length);
//            System.out.println(str[0].length);
//        }
//    Option
//    A)Error
//    B)3
//            5
//    C)3
//            13
//    D)None

        public static void main13(String[] args)
        {
            int number = 11;
            int NUMBER = 22;
            int Number = 33;
            System.out.print(number + " ");
            System.out.print(NUMBER + " ");
            System.out.println(Number);
        }
//    Option
//    A)11 22 33
//    B)11 11 11
//    C)33 33 33
//    D)error


        public static void main14(String[] args)
        {
            String str[] = { "Techno", "for", "Techno" };
            System.out.print(str[0] + str[1] + str[2]);
        }
//    Option
//    A)TechnoforTechno
//    B)gfg
//    C)Error
//    D)none
    }

