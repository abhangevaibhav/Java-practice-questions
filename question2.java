import java.util.*;

//2. Make a program that takes the radius of a circle as input, 
//calculates its radius and area and prints it as output to the user.
public class question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle:");
        int radius = sc.nextInt();
        System.out.println("Radius is:" + radius);
        float a = 3.14f * radius * radius;
        System.out.println("Area:" + a);
    }
}
