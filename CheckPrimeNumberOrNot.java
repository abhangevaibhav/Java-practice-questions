//Qs. Print if a number is prime or not (Input n from the user). [In this problem you will learn how to check if a number is prime or not]

import java.util.*;

public class CheckPrimeNumberOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n:");
        int n = sc.nextInt();
        boolean prime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("The Number n is not prime number");
                prime = false;
                break;
            }
        }
        if (prime)

        {
            if (n == 1) {
                System.out.print("The number entered is neither prime nor composite number");
            } else {
                System.out.print("The number is prime number.");
            }
        }
    }
}
