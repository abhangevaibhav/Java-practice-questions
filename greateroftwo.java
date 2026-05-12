
//3.	Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class greateroftwo {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        if (a > b) {
            System.out.print("The greater Number is : " + a);
        } else {
            System.out.print("The greater number is : " + b);
        }
    }
}