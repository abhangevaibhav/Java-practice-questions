
//7.	Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;

public class countdifferenttypeofnumbers {
    public static void main(String args[]) {
        System.out.print("Enter number of numbers that you have to enter:");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int zeros;
        zeros = 0;
        int positive;
        positive = 0;
        int negative;
        negative = 0;

        for (int i = 1; i <= a; i++) {

            System.out.print("Enter number" + i + ":");
            int b = sc.nextInt();
            if (b == 0) {

                zeros++;
            } else if (b > 0) {

                positive++;
            } else {

                negative++;
            }

        }
        System.out.println("Count of Positive Numbers entered are:" + positive);
        System.out.println("Count of Negative Numbers entered are:" + negative);
        System.out.println("Count of Zeros entered are:" + zeros);
    }
}