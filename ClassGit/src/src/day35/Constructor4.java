package src.day35;

public class Constructor4 {

    private Constructor4(int data) {
        System.out.println("Constructor called");
    }

    public void myMethod() {
        System.out.println("Method called");
    }

    //this is a method that returns a class c4.
    //and this class has a constructor that pass parameter value;
    static Constructor4 create(int value) {
        Constructor4 c4 = new Constructor4(value);
        return c4;
    }

    public static void main(String[] args) {
        Constructor4 myClass = Constructor4.create(42);

        myClass.myMethod();
    }
}
//a) Constructor called Method called
//b) Compilation error
//c) Runtime error
//d) None of the above