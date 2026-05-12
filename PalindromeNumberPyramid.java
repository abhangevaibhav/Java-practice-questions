//3.	Print a palindromic number pyramid.
public class PalindromeNumberPyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int m = 2; m <= i; m++) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
