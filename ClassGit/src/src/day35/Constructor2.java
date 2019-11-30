package src.day35;

public class Constructor2 {

    int number;
    String name;

    public Constructor2() {
        System.out.println("Constructor called");
    }
    private Constructor2(int num) {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Constructor2 c2 = new Constructor2();

        Constructor2 c22 =new Constructor2(4);

        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}

