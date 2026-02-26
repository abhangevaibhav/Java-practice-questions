import java.util.Scanner;

public class Stringinfiniteloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        for (int i = 0; i >= 0; i++) {
            System.out.println(i + " " + name + " ");
        }

    }
}
