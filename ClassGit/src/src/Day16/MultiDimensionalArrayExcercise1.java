package src.Day16;

public class MultiDimensionalArrayExcercise1 {

        public static void main(String[] args) {
            int[] apple = {3, 4, 5};
            int[] milk = {3, 3, 3};

            for (int i = 0; i < apple.length; i++) {
                System.out.print(apple[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < milk.length; i++) {
                System.out.print(milk[i] + " ");
            }

            int[][] array2D = {
                    // 0  1  2 columns
                    {1, 2, 3},// 0. row
                    {10, 20, 30, 40},// 1. row
            };

            System.out.println("\n2D Array ----------------");
            System.out.println("Item rows: " + array2D.length);
            System.out.println("Item 0.row, column length: " + array2D[0].length);
            System.out.println("Item 1.row, column length: " + array2D[1].length);

            System.out.println("\n ----------------");

            for (int row = 0; row < array2D.length; row++) { // rows
                for (int col = 0; col < array2D[row].length; col++) { // columns
                    System.out.print(" Item: " + array2D[row][col]);
                }
                System.out.println();
                // 23
                // 3
            }


//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[i].length; j++) {
////                System.out.print(items[row][col] + " ");
//                System.out.println(i + "-" + j + " value: "+ items[i][j]);
//            }
//            System.out.println();
//        }
        }
    }


