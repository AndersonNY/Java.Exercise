package src.day36;

public class Task2 {


    public static void main(String[] args) {
            String[] arr = {"Hi", "Hello", null};

            // print first characters of words

        try {
            for (int i = 0; i <arr.length; i++) {

                char []c=arr [i].toCharArray();

                System.out.println(c[0]);
            }

        } catch(Exception ex) {

            System.out.println("hey you have an error");

            ex.printStackTrace();;

        } } }



//public class Task2 {
//    public static void main(String[] args) {
//        String[] arr = {"Hi", "Hello", null};
//        // print first characters of each words
//        // Hint: use charAt(0) to get first character of string
//
//        for (String word : arr) {
//            try {
//                System.out.println(word.substring(0, 1));
//            }catch (Exception ex){
//                System.out.println("We have non existing string");
//            }
//        }
//    }
// }
