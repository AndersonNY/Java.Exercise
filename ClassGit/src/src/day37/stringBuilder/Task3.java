package src.day37.stringBuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import javax.naming.LinkException;

//public class Task3 {

    //Using StringBuffer create English alphabet
    //Hint: you can use ASCII table
    //Hint2; Loop( from 'A' to 'Z')
    // return "ABC..........XYZ" all 26 letters



//        //Using StringBuffer create English alphabet
//        //Hint1: you can use ASCII table
//        //Hint2: loop(from 'A' to 'Z')
//        // return "ABC........XYZ" all 26 letters
//        public String getAlphabet() {
//            StringBuffer sb = new StringBuffer();
//            for (char letter = 'A'; letter <= 'Z'; letter++) {
//                sb.append(letter);
//            }
//            return sb.toString();
//        }
//
//        //Using StringBuffer get only vowels from alphabet
//
//        @Test
//        public void test() {
//            String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//            String actual = getAlphabet();
//
//            Assert.assertEquals(expected, actual);
//
//            public String getVowels () {
//
//                StringBuffer alphabet = new StringBuffer();
//                for (char i = 'A'; i <= 'Z'; i++) {
//                    if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
//                        alphabet.append(i);
//                    }
//                }
//                String result = alphabet.toString();
//                 sb;
//                return sb.toString();
//            } } }