package src.Day17;

//part4, as homework
//USING TWO LOOP print names and surnames
//ex:
//Bayram Guney
//Micheal Jackson

import org.w3c.dom.ls.LSOutput;

public class HM {

    public static void main(String[] args) {




    String[][] array = {{"Betul", "whiteWolf"},
                         {"Orhan", "Akkurt"}
    };
        System.out.println("HARDCODE--------------");
                         //      j  i
        System.out.println(array[0][0] + " " + array[1][0] + " ");
        System.out.println(array[0][1] +  " " + array[1][1] + " ");

        System.out.println("for loop=========================================");

        for (int i=0; i < array.length ; i++) {
        for (int j = 0; j < array[i].length; j++) {

            System.out.print(array[j][i] + " ");
        }
            System.out.println();



    } }}
