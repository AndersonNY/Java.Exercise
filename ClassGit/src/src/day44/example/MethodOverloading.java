package src.day44.example;


    public class MethodOverloading {
        void Multiply(int x, int y) {
            System.out.println(x * y);
        }
        void Multiply(double x, double y) {
            System.out.println(x * y);
        }

        public static void main(String[] args) {
            MethodOverloading mo = new MethodOverloading();
            mo.Multiply(3,5);
            mo.Multiply(3.654,5.467);
        }
    }

