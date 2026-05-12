//2.	Print a hollow Rhombus.

public class HollowRhombus {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == 1 || i == 5) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print("*");
                }
            } else {
                for (int m = 1; m <= 3; m++) {
                    System.out.print(" ");
                }
            }

            System.out.println("*");
        }
    }
}