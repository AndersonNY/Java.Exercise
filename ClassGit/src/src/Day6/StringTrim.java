package src.Day6;

public class StringTrim {

    // Trim () is meant to remove
    // white space characters at the beginning

        public static void main(String[] args) {
            String string = "   Hello       ";
            System.out.println(string);
            System.out.println(string.trim());

            String s2 = "   Hello  World     ";
            System.out.println(s2.trim());
        }
    }
