package src.Day15;

public class HomeWork {


        //TODO
        // research on topics "Multi Dimensional Arrays", "Nested Loops"
        // Task
        // 1. Return the number of even ints in the given array.
        // Hint: you need to count "even numbers"
        // 2.Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
        //


        public static void main(String[] args) {
            int[] intArray = {1, 2, 3, 4, 5, 6};

            int evenCounter = 0;
            for (int i = 0; i < intArray.length; i++) {
                int currentNumber = intArray[i];
                boolean numberIsEven = currentNumber % 2 == 0;

                if (numberIsEven) {
                    evenCounter++;
                }
            }

            System.out.println("you have " + evenCounter + " even numbers");
        }

    }



//    int[] arr = new int[10];
//    int evenCounter = 0;
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = rand.nextInt(20);
//        }

//        for (int n : arr) {
//        System.out.println("  it is an number " + n);
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] % 2 == 0) {
//        evenCounter++;
//        }
//        }
//
//        System.out.println("you have " + evenCounter + " even numbers");
//        }
//        }
//
//



