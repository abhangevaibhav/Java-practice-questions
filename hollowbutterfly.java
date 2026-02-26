import java.util.*;

public class hollowbutterfly {
    public static void main(String args[]) {
        int a = 5;
        int i;
        for (i = 1; i <= a; i++) {
            int j = 1;
            System.out.print("*");
            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
            } else {
                System.out.print("*");
            }

            int k;
            for (k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            if (i == 1) {
            } else {
                System.out.print("*");
            }
            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (i = a; i >= 1; i--) {
            System.out.print("*");
            int j;
            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
            } else {
                System.out.print("*");
            }
            int k;
            for (k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            if (i == 1) {
            } else {
                System.out.print("*");
            }
            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}