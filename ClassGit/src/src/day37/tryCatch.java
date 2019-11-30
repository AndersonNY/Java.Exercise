package src.day37;

public class tryCatch {

    public static class ATM {

        public int withdraw(int yourBalance, int moneyYouWant) {
            if (yourBalance < moneyYouWant) {
                RuntimeException haveNoMoney = new RuntimeException("Have not enough money in balance");
                throw haveNoMoney;
            }

            return moneyYouWant;
        }


        public static void main(String[] args) {
            ATM atm = new ATM();

            try {
                atm.withdraw(10, 100);
            } catch (Exception ex) {
                System.out.println("I'm in catch body");
            } finally {
                System.out.println("I'm in finally body");
            }


            System.out.println("Some code after withdraw");
        }
    }


}
