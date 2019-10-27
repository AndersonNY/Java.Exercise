package src.Day15;

public class ArrayTask5 {
    // TODO
    // Given 2 arrays of ints, a and b, print "have the same first elements"
    // if the have the same first element


    public static void main(String[] args) {

        // Hint:
        // create two arrays, fill it with numbers
        // check number at index 0


        int [] a= {4,5,8,8,18,100, 98};
        int [] b= {4,10,20,19,98};
        // Part 1

       if (a[0]== b [0])  {

            System.out.println("have the same first element");

        }

       // part 2
        int lengthOfA = a.length; //5
        int lengthOfB = b.length; //3
        if (a[lengthOfA-1] == b[lengthOfB -1]) {

            System.out.println("have the same last elements");

        }

        // part 3

        System.out.println("part3-------------");

        if (a [lengthOfA / 2] == b [lengthOfB/2]) {

            System.out.println("have the same middle elements");
        }

        // part 4. check every element, if they are same print => "arrays are same"
        // ex;
        // a = {5,6,6}
        //b= {5,6,7}
        // = > "arrays are same"
        // ex2 ;

        //a = {3,2.6}
        // b = {5,6,7}

        // => " arrays are different"



    }

}
