package src.day43.Overriding;

public class Overriding2 {

    public static void main(String[] args) {
        Animal animal = new Cat ();
        animal.sound ();

        ((Cat)animal).sleep ();
    }


}
