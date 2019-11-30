package src.Day24;

public class Example {

    public int x;

    // (What is static) Classes/Attributes/
        // class members
//    https://www.w3schools.com/java/java_classes.asp
//    https://www.w3schools.com/java/java_class_attributes.asp
//    https://www.w3schools.com/java/java_class_methods.asp
//    https://www.w3resource.com/java-tutorial/java-class-methods-instance-variables.php
            public static void main(String[] args) {
                AnyMethod();
//        DifferentMethod1();
                DifferentMethod2();
            }
            private static void DifferentMethod2() {
            }

            public void DifferentMethod1() {
                System.out.println("print something");
            }

            private static void AnyMethod() {
                System.out.println("print here");
            }
        }