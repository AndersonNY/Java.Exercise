package src.Day6;

public class StringIndexOf {

    // Searching in Strings With indexOf()

    public static void main(String[]args) {
        //01234

        String s1 = "Hello";

        System.out.println(s1.indexOf("ello"));

        System.out.println("-------------------");

        System.out.println("EX 2---------------------------");
        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);

        System.out.println("EX 3---------------------------");
        String s3 = "so something so many";
        int indexS3 = s3.indexOf("so");
        System.out.println(indexS3);

        //Task 1; write code that count length of string and prints sum of length and index of "e"

        // ex: "techno" => 6+1 =7
        // hint: length(), indexOf()

        System.out.println("TASK 1---------------------------");
        //Task 1: write code that count length of string and prints sum of length and index of "e"
        //    ex: "techno" => 6+1 => 7
        //    hint: length(), indexOf()
        String str = "techno study";
        int length = str.length(); // 12
        int index = str.indexOf("e"); // 1

        int sum = length + index;
        System.out.println(sum);

    } {

        String str = "techenoe";
        int length = str.length(); // 8
        int index = str.indexOf("e"); // 1

        int sum = length + index; // 8 + 1
        System.out.println(sum);
    }

}









