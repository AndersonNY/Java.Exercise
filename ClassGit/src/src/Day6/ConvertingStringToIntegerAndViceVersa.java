package src.Day6;

public class ConvertingStringToIntegerAndViceVersa {

    public static void main(String[] args) {
        // valueOf() which can be used to convert a number to a String
        // Converting integer to String
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.println(s1 + 10); //"10" + 10 => 1010
        System.out.println("10" + 10);
        System.out.println(number + 10); // 20

        System.out.println("---------------------------------------");
        // Converting String to integer
        String s2 = "30";
        int n2 = Integer.valueOf(s2);
        // 30 + 10 => 40
        System.out.println(s2+10); // "30" + 10 => "3010"
        System.out.println(n2+10); // 30 + 10 => 40


        //TODO TASK1; write a program that take string and give us sum result:

        //ex: s1="100", s2= "300" => 400

        String sum1 = "100";
        String sum2 = "300";
        int sum3 =Integer.valueOf(sum1)+Integer.valueOf(sum2);

        System.out.println(sum3);
        //TODO Task 2: write a program that
        // take this values and prints the average
        // values = ["5", 50, 2.24, "22", 50000];
        String v1 = "5";
        int v2 = 50;
        double v3 = 2.24;
        String v4 = "22";
        int v5 = 50000;

        String v6 = "22.234234";
        Double.valueOf(v6);

        double average = (Integer.valueOf(v1) + v2 + v3 + Integer.valueOf(v4) + v5) / 5;
        System.out.println(average);




    }
}








