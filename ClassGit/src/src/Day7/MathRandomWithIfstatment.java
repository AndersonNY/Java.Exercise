package src.Day7;

public class MathRandomWithIfstatment {

    //printing number in range
    public static class MathRandom3 {
        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        public static void main(String[] args) {
            int min = -30;
            int max = 40;
            int range = max - min;

            int randomInRange = min + (int) (Math.random() * (range + 1));
            System.out.println(randomInRange);

            int temperature = randomInRange;
            System.out.println("Temperature is: " + temperature);

            if (temperature == 40) {
                System.out.println("Frying");
            }
            if (temperature >= 27) {
                System.out.println("Its hot");
            }
            if (temperature >= 20 && temperature <= 27) {
                System.out.println("Its warm");
            }
            if (temperature < 20 && temperature >= 10) {
                System.out.println("Cool");
            }
            if (temperature < 10) {
                System.out.println("Freezing");
            }
        }
    }
}


