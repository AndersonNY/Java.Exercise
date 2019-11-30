package src.day32;

public class Animal {

    public String name; // cat, dog
        public String breed;
        public int age;
        public double weight;
        public int legs;
        public boolean poisonous;

        public int getSpeed() {
            return legs * 10;
        }

        public boolean canJump() {
//        if (legs >= 2) {
//            return true;
//        } else {
//            return false;
//        }

            return legs >= 2;
        }

        public void cuteness(){
            if(legs == 0){
                System.out.println("Not cute");
            }else if(legs == 2){
                System.out.println("Some what cute");
            }else if(legs == 4){
                System.out.println("Perfect");
            }else if(legs < 0){
                System.out.println("OMG");
            }else if(legs > 4){
                System.out.println("MUTANT");
            }
        }

    }

