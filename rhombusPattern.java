//1.	Print a solid rhombus.
public class rhombusPattern {
    public static void main(String args[]) {
        int n = 5;
        for (int k = 1; k <= n; k++) {
            int a;
            a = n - k;
            for (int i = 1; i <= a; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
