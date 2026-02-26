//Q3. Print the sum of first n natural numbers

import java.util.Scanner;

class recursion1 {
    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        printSum(n - 1, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n:");
        int n = sc.nextInt();

        printSum(n, 0);
    }
}