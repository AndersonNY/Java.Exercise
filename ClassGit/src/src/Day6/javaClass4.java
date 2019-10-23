package src.Day6;

public class javaClass4 {


    public static void main (String[]args) {

        //String length

        String s1 = "ABCDE";

        System.out.println(s1.length());

        int length = s1.length();

        System.out.println(length);
        String username= "techno.study";

        if (username.length()< 10) {

            System.out.println("you can login");
        }

        if (username.length()>= 10) {

            System.out.println("you cannot login");
        }

        //Task1: write a program that sum two strings length
        // ex: "ABC", "Z" => 3+1 =>
        //output : "Length is 4"

        String a1= "ABC";
        String a2= "Z";
      //1.way
        System.out.println("Length is " +(a1+a2).length() );

        //2.way

        System.out.println ("Length is" + (a1.length()+a2.length()));
        // third way

        int lengthA1 = a1. length();
        int lengthA2 = a2. length();
        int sum = lengthA1+ lengthA2;

        System.out.println("Length is " + sum);

        //TASK 2;

        // Write a program that check if the subrattion of s1 and s2's length ()

        // is less then 0
        // if the less print "cannot proceed", else "we can do it"
        // ex1: s1= "LongStringHere" , s2= "Shortone"
        //=> "We can do it
        // ex2; s1= "short", s2= "loooong"

         //      => "can not proceed"

        String c1 = "short";
        String c2 = "Loooong";


        int lengthC1 = c1. length();
        int lengthC2 = c2. length();
        int subtraction = lengthC1- lengthC2;

        // for example assuming subtraction = 4

        if (subtraction < 0) { //4 < 0

            System.out.println("can not proceed");

        } else {

            // 4>=0
        System.out.println ("we can do it");






    }


}
}