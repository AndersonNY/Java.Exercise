package src.Day16;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class NestedLoopTask2 {

    public static void main(String[] args) {
        //using loop print multiplication table of 1
        //output:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }
            System.out.println();
        }




    //ex:
    // 1 + 1 = 2
    // 1 + 2 = 3
    // 1 + 3 = 4
    // 1 + 4 = 5
    // 1 + 5 = 6
    // 1 + 6 = 7
    // 1 + 7 = 8
    // 1 + 8 = 9
    // 1 + 9 = 10
    // 1 + 10 = 11

     for (int a = 1; a <= 10; a++){
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        System.out.println();

    } }
}
