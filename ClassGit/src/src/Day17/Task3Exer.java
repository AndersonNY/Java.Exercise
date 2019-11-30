package src.Day17;


import org.w3c.dom.ls.LSOutput;

public class Task3Exer {

    public static void main(String[] args) {

        String[][] array = {
                {"apple", "lemon", "peach",}, //0
                {"red", "green", "blue",},    //1
        };

        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();

            System.out.println("....................");

        }
        System.out.println("............");

        System.out.println(array[1][0] + " " + array[1][1] + " " + array[0][2]);
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);


        System.out.println(".................");

        for (int i = array.length -1; i >= 0; i--) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");


            System.out.println(array[0][0] + " " + array[1][0] ) ;
            System.out.println(array[0][1] + " " + array[1][1]  );
            System.out.println(array[0][2] + " " + array[1][2] );

            System.out.println("part 3---------------------");


            }


        }



    }
