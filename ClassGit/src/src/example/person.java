package src.example;

public class person {


    public class Person {

        //public to field/attribute
        public String name;

        //public to constructor
        public Person() {
            System.out.println("In Default Constructor");
        }

        //public to method
        public String giveMeName() {
            return name;
        }

        //public to method
        public void printDetails() {
            System.out.println("Some details");
        }
    }
}
