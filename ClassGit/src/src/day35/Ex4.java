package src.day35;


    class Food {

        public String name;

        public Food() {
            System.out.println("Default constructor");
            name = "My Food";
        }

        public Food(String n) {
            System.out.println("Constructor with one parameter");
            name = n;
        }

        public String print() {
            return "Food name is:" + name;
        }

    }

    public class Ex4 {
        public static void main(String[] args) {
            Food pie = new Food();
            pie.name = "Teramisu";
//        System.out.println(f.name);
            System.out.println(pie.print());

            System.out.println("-----------------------------");
            Food cake = new Food("Cake");
//        System.out.println(cake.name);
            System.out.println(cake.print());

            System.out.println("-----------------------------");
            Food something = new Food();
            System.out.println(something.print());
        }
    }