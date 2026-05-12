import java.util.*;

public class NumberTable {
    public static void main(String args[]) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to print NumberTable:");
        num = sc.nextDouble();
        for (int i = 1; i <= 10; i++) {

            double Table = num * i;
            System.out.println("NumberTable of Number is :" + Table);

        }
    }
}