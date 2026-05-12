
//1.	Print all even numbers till n.
import java.util.*;

public class EvenNumber {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter number n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("all even numbers till n is :");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
