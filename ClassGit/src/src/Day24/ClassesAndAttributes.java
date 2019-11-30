package src.Day24;

public class ClassesAndAttributes {
        // (What is static) Classes/Attributes/
        // class members
//    https://www.w3schools.com/java/java_classes.asp
//    https://www.w3schools.com/java/java_class_attributes.asp
//    https://www.w3schools.com/java/java_class_methods.asp
//    https://www.w3resource.com/java-tutorial/java-class-methods-instance-variables.php

        int x = 5;
        public static void main(String[] args) {
            Example ex2 = new Example();
            System.out.println(ex2.x);

            TechnoStudyMethod();
//        TechnoStudyMethod2();
        }

        public void PublicMethod() {
            System.out.println("print something");
        }

        public static void TechnoStudyMethod() {
            System.out.println("print here");
        }
    }

