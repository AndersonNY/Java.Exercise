package src.Day16;

public class NestedLoopTask1 {

      // task
    // print grid of "#" of 10 rows and 10 columns
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("category: " + i); // Automative & Wheel
            for (int j = 0; j < 10; j++) {
                System.out.println("item: " + j + " of category: " + i); // Wheel
                for (int k = 0; k < 5; k++) {
                    System.out.println("detail: " + k + " of item: " + j); // General Grabber AT2 Radial
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
