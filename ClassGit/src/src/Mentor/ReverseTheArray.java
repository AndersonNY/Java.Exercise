package src.Mentor;

public class ReverseTheArray {

    public static void main(String[] args) {


        String[] strarr1 = {"Seattle", "California", "Florida", "Texas", "Georgia"};

//      Georgia   Texas  Florida   California   Seattle

        for (int i = strarr1.length - 1; i >= 0; i--) {

            System.out.print(strarr1[i] + " ");

        }
        System.out.println();
        System.out.println("--------------------");


//      reverse multi dimontional array

//        0 0 ,  0 1 ,0 2
//        1 0 ,  1 1 ,1 2

        String[][] strarr2 = {{"USA", "Mexico"}, {"South Korea", "Russia", "China"}, {"India", "Pakistan"}};

        for (int i = strarr2.length - 1; i >= 0; i--) {

            for (int j = strarr2[i].length - 1; j >= 0; j--) {

                System.out.print(strarr2[i][j] + " ");

            }

            System.out.println();

        }


//      reverse the each character in the array seattle elttaes new york kroy wen
//      Get the String array as $115  $23 , $75  remove the $ and sum the numbers


    }
}


