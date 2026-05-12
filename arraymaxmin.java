import java.util.*;

public class arraymaxmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            numbers[i] = sc.nextInt();
        }

    }
}