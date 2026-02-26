import java.util.*;

public class Heart {
    public static void main(String args[]) {
        int a = 3;
        for (int i = 1; i <= a; i++) {
            int c = a - i;
            if (i == 1) {
            } else {
                for (int j = 1; j <= c; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("**");
                }
                for (int j = 1; j <= c; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
        int b = 5;
        for (int i = 1; i <= b; i++) {
            if (i == 2) {
            } else if (i == 4) {
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                int d = b - i + 1;
                for (int k = d; k >= 1; k--) {
                    System.out.print("**");
                }
                System.out.println();
            }
        }
    }
}