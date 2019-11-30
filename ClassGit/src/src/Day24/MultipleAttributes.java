package src.Day24;

public class MultipleAttributes {

    public static class Person {
        String firstName = "Techno";
        String lastName = "Study";
        int age = 6;

        public static void main(String[] args) {
            Person person = new Person();
            System.out.println("Name : " + person.firstName + " " + person.lastName);
//        System.out.println(person.firstName);
//        System.out.println(person.lastName);
            System.out.println(person.age);
        }
    } }


