package src.Day6;

public class javaClass3 {

    public static void main(String[]args){

        //Concatenating strings

        String s1 = "Hello";
        String s2 = "World!!!";

        System.out.println(s1+s2);

        //use separate variable for each word print it in one line
        //using concatenation
        // ex: "What", "is", "your", "name", "?" => what is your name
        // hint you can also add extra variable with space => String s = " " ;



        String s4= "What";
        String s5= "is";
        String s6= "your";
        String s7= "name";
        String s8= "?";
        String space = " ";

        /// "What" + " " + "is" + " " + "your" + " " + "name"
        System.out.println(s4 + space + s5 + space + s7 + space + s8);

        //Task2: continue task1, but print each word in new line using only
        //one System.out.println()
        space = "\n";

        //"What" + "\n" + "is" + "\n"
        System.out.println(s4 + space + s5 + space + s6 + space +s7 + space + s8);

        System.out.println("A\nB\nC\nD\nE\nF");







    }
}
