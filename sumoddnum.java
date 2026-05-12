//2.	Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

import java.util.*;

public class sumoddnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n = sc.nextInt();
        int sum;
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
            } else {

                sum = sum + i;

            }

        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is : " + sum);
    }
}