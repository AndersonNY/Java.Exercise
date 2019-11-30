package src.day37.stringBuilder;

public class Task2 {

    // write a method that will reverse your string
    public String reverseString(String yourString) {
        // write you code here
        StringBuilder sb = new StringBuilder(yourString);

//        StringBuilder reverse = sb.reverse();
//        String result = reverse.toString();

        return sb.reverse().toString();
        // end of your code
    }

}
