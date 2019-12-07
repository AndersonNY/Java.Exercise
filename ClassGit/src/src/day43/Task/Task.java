package src.day43.Task;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Task {

         //create class Multiplier
        //create method which multiply 2 integers
        //create method which multiply 3 integers
        //create method which multiply a list of integers
        //create method which multiply 2 double
        //and test them using junit

    public static class multiply  {


        static int multiply (int x, int y) {

            return x*y;

        }

        static int add(int x, int y, int z) {
            return x*y*z;
        }

        static int multiply (List<Integer>numbers) {
            int result = 1;

            for (Integer number : numbers) {

                result *= number;
            }

            return result;

        }

            static double multiply(int i, double x, double y){
                return x * y;

            }



        @Test
        public void multiplyTwoIntegers() {
            int actual = multiply(2, 2);
            int expected = 4;

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void multiplyThreeIntegers() {
            int actual = (int) multiply (2, 2, 2);
            int expected = 8;

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void multiplyListIntegers() {
            int actual = multiply(Arrays.asList(1, 2, 3));
            int expected = 6;

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void multiplyTwoDoubles() {
            double actual = multiply(2, 2);
            double expected = 4;


            Assert.assertEquals(expected, actual, 1);
        }

    } }