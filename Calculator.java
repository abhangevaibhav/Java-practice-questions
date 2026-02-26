import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b:");
        int b = scanner.nextInt();
        System.out.println(
                "Enter 1 for Addition:\nEnter 2 for Subtraction:\nEnter 3 for Multiplication:\nEnter 4 for Division:\nEnter 5 for remaninder when divided:");
        int c = scanner.nextInt();
        scanner.close();
        switch (c) {
            case 1:
                int d = a + b;
                System.out.println("Addition:" + d);
                break;
            case 2:
                int e = a - b;
                System.out.println("Subtraction:" + e);
                break;
            case 3:
                int f = a * b;
                System.out.println("Multiplication:" + f);
                break;
            case 4:
                int g = a / b;
                System.out.println("Division:" + g);
                break;
            case 5:
                int h = a % b;
                System.out.println("remainder:" + h);
                break;
            default:
                System.out.println("The number you entered is not valid please enter correct number");
        }
    }
}