
//Qs. Write a function to multiply 2 numbers
import java.util.*;

public class functionquestion1 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println("The multiplication of a and b is :" + result);
    }
}