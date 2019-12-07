package src.day44.example;

public class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class BankOfAmerica extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class TDBank extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class CliftonBank extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class JPMorganChase extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class TestPolymorphism {
    public static void main(String args[]) {
        Bank b;
        b = new BankOfAmerica();
        System.out.println("BankOfAmerica Rate of Interest: " + b.getRateOfInterest());
        b = new TDBank();
        System.out.println("TDBank Rate of Interest: " + b.getRateOfInterest());
        b = new CliftonBank();
        System.out.println("CliftonBank Rate of Interest: " + b.getRateOfInterest());
        b = new JPMorganChase();
        System.out.println("JPMorganChase Rate of Interest: " + b.getRateOfInterest());
    }
}