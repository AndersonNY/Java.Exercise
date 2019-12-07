package src.day43.Overriding;


    public class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Cat say meow");
        }

        public void sleep() {
            System.out.println("Cat sleep");
        }
    }

