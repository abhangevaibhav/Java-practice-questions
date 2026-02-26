
//c.	Taking an array as an input and printing its elements.
import java.util.*;

public class arrayquestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The size of arrays is :");
        int i;
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("The arrays:");
        for (i = 0; i <= size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}