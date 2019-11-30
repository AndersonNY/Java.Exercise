package src.Day23;

public class Task6Array {


    // Given an array of ints,
    // print true if it contains no 1's or it contains no 4's.

    // {1,2,3} => true
    // {2,3,4} => true
    // {1,2,4} => false
    public static void main(String[] args) {


        int[] intArray = {1, 2, 3, 4,};

        boolean decision1 = false;
        boolean decision4 = false;

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] == 1) {
                decision1 = true;
            }

            else if (intArray[i]==4) {

                decision4 = true;

            }

            if (decision1==true&&decision4==true) {

                System.out.println("false");
        } else {



    }
            System.out.println("true");


        }

        // Given an array of ints,
        // print true if it contains no 1's or it contains no 4's.
        // {1, 2, 3} => true
        // {2, 3, 4} => true
        // {1, 2, 4} => false
        //Hint: use boolean variable to hold state
//            int[] numbers = {1, 2, 4};
//            boolean haveOne = false;
//            boolean haveFour = false;
//
//            for (int number : numbers) {
//                if (number == 1) {
//                    haveOne = true;
//                } else if (number == 4) {
//                    haveFour = true;
//                }
//            }
//
//            if (haveOne && haveFour) {
//                System.out.println(false);
//            } else {
//                System.out.println(true);
//            }
//        }
//
//    }
//















    } }




