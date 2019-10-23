package src.Day6;

public class ComparingString {

    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";

        if(s1 == s2){
            System.out.println("its equal");
        }

        String s3 = new String("YES");
        String s4 = new String("YES");

        if(s3.equals(s4)){
            System.out.println("its equal again");
        }

        String name = "Ali";             //because of max name it's not allowed to write Ali
        if(name.equals("Max")){
            System.out.println("Hello");
        }

        String nameOfCourse = "TS";
        if(nameOfCourse.equals("TS")){
            System.out.println("You gonna be Tester after 6 months");
        }


        // Task 1:
        //  check if string is equals to your name, print your surname
        //  ex: Michale => Jackson
        String name2 = "Michale";
        String surname = "Jackson";

        if(name2.equals("Michale")){
            System.out.println(surname);
        }

        int number = 10;
        if (number == 10) {
            System.out.println("its ten");
        }

//        summary
//        in String use .equals
        // in number(int, double, etc....) use ==
        // to check equality
    }
}








