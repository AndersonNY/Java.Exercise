package src.day37.stringBuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {


    // you have list of student names
// you need to return a string which is first letter of their names

    // ex: {Max, Adam, Susan} => "M,A,S"
    // hint: charAt, substring

        public String getLetters(ArrayList<String> names) {
                String result = " ";


                for (String name : names) {

                        String firstLetter = name.substring(0, 1);
                        result += firstLetter;

                        // 2.way
                        char chartAtFirst = name.charAt(0);
                        result += String.valueOf(chartAtFirst);
                }

                return result;

        }
        @Test

        public void test1() {
                // GIVEN
                List<String> names = Arrays.asList("Tuba", "Sena", "Burak");
                // WHEN
                String expected = "TSB";
                String actual = getLetters((ArrayList<String>) names);
                // THEN
                Assert.assertEquals(expected, actual);
        }

}


