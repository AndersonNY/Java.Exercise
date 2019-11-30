package src.Day23;

public class Task63Array {

    // Given an array of ints,
    // print "true" outside of loop, if it does not contains 4
    // {4, 1, 1} => false
    // {1, 2, 3} => true
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state

    public static void main(String[] args) {



    int [] a= {1,2,3,4};

        boolean check= false;
        for (int i:a) {
            if(i==4) {

                check = true;

            }


}
        System.out.println("true");

        // Given an array of ints,
        // print "true" outside of loop, if it does not contains 4
        // {4, 1, 1} => false
        // {1, 2, 3} => true
        // DON'T USE BREAK
        // Hint: use boolean variable to hold state
            int[] numbers = {3, 1, 1};

            boolean haveFour = false;
            for (int number : numbers) {
                if (number == 4) {
                    haveFour = true;
                }
            }

            if (haveFour = false) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }

} }




