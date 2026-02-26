import java.util.*;

public class dowhile {
    public static void main(String args[]) {
        int i = 0;
        System.out.print("Enter How many times the name should print:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        do {
            System.out.println(i + "Vaishnavi Abhange");
            i++;
        } while (i <= a);
    }
}