package src.day26_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception4 {


    //FileNotFoundException
        public static void main(String[] args) {
            try {
                File file = new File("D:\\SomeFolder\\file.txt");

                FileReader fileReader = new FileReader(file);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found;");
                System.out.println(ex.getStackTrace());
            }
        }
    }


