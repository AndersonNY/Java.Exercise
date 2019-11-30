package src.Day23;

public class Task2 {

     // write a java program that find maximum
        // of three numbers
        public static void main(String[] args) {

            int a=10;
            int b=20;
            int c=30;
            if (a >= b&& a>=c) {
                System.out.println("max is:" + a);
            } else {
                System.out.println("max is:" + c);
            }

        }
}


//    /            int a = 34;
//                int b = 45;
//                int c = 78;
//
//                if(a>=b){
//                    if(a>= c)
//                        System.out.println(a + " is the largest number.");
//                    else
//                        System.out.println(c + " is the largest number.");
//                }
//                else {
//                    if(b >= c)
//                        System.out.println(b + " is the largest number.");
//                    else
//                        System.out.println(c + " is the largest number.");
//