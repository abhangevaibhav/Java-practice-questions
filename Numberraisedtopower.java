import java.util.*;

//	Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
public class Numberraisedtopower {
    public static void main(String args[]) {

        int x;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base x:");
        x = sc.nextInt();
        System.out.print("Enter Power n:");
        n = sc.nextInt();
        double a;
        a = Math.pow(x, n);
        System.out.println("The value of one number raised to the power of another is:" + a);
    }
}