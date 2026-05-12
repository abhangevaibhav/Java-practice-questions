
//1.	Enter 3 numbers from the user & make a function to print their average.
import java.util.*;

public class average {
    public static void main(String args[]) {
        int a, b, c;
        System.out.println("Enter a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        float average = (a + b + c) / 3;
        System.out.println("The average:" + average);
    }
}