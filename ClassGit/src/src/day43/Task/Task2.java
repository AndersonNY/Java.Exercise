package src.day43.Task;

import src.day43.Overriding.Animal;
import src.day43.Overriding.Cat;
import src.day43.Overriding.Dog;
import src.day43.Overriding.Fox;

public class Task2 {

    // add specific methods for Dog, Cat and Fox
    // call those methods via Animal reference

    public static void main(String[] args) {


        Animal cat = new Cat();
        ((Cat) cat).sleep();

        Animal dog = new Dog();

        ((Dog) dog).sound();


        Animal fox = new Fox();

        ((Fox) fox).sound();


    }



}
