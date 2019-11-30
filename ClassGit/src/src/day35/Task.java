package src.day35;

class Mustafa {

    public String name;
    public int age;
    public String eyeColor;

    public Mustafa(String m) {

        name = m;
    }

    public Mustafa(int a) {
        age = 40;
    }


    public Mustafa() {
        eyeColor = "Brown";
    }

    public String print() {

        return name + " " + eyeColor + " " + "40";

    }


}

public class Task {

    //create a class
// add at least 3 attributes
// add at least 3 constructor
// add method that return all attributes as one string
// in Task 2 class create at least 4 object on that class
// call method to get attributes and print it
    public static void main(String[] args) {

        Mustafa a = new Mustafa();

        a.name = "Nuran";

        Mustafa b = new Mustafa();

        a.age = 40;

        Mustafa c = new Mustafa();
        c.eyeColor = "Black";

        Mustafa d = new Mustafa();

        System.out.println(d.print());

    }

}


//class Bank {
//    public int year;
//    public int serial;
//    public String name;
//    public boolean trustworthiness;
//
//    public Bank(){
//        year = 0;
//        serial = 0;
//        name = "Unknown bank";
//    }
//
//    public Bank(boolean t){
//        this(2019, 10, "Bank of America");
//        trustworthiness = t;
//    }
//
//    public Bank(int year, int num, String name) {
//        this.year = year;
//        serial = num;
//        this.name = name;
//    }
//
//    public String getAttributes(){
//        return "Bank Year:" + year + "\n"
//                + "Bank Name:" + name + "\n"
//                + "Serial Number:" + serial + "\n";
//    }
//}
//
//public class Task2 {
//    public static void main(String[] args) {
//
//    }
//
//}
//
//
//

