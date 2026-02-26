//Qs. Write a function to calculate the factorial of a number.

import java.util.*;

public class functionquestion2 {
    public static int fact(int m) {

        int facto = 1;
        for (int i = m; i >= 1; i--) {
            facto = facto * i;
        }
        return facto;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int factorial;
        factorial = fact(n);
        System.out.println(factorial);

    }
}