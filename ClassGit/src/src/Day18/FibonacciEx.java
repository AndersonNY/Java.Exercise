package src.Day18;

public class FibonacciEx {

        public static void main(String[] args) {
            //BigInteger to hold big numbers
            long[] nums = new long[100];

            //fib(n) = fib(n-2) + fib(n-1);
            nums[0] = 0;
            nums[1] = 1;
            nums[2] = 1;
            nums[3] = nums[1] + nums[2];

            for (int i = 3; i < nums.length; i++) {
                nums[i] = nums[i - 2] + nums[i - 1];
                // nums[3] = nums[3-2] + nums[3-1];
                // nums[3] = nums[1] + nums[2];
            }

            for (long num : nums) {
                System.out.print(num + " ");
            }


        }
    }