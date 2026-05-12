
//2. Make a program that takes the radius of a circle as input, 
//calculates its radius and area and prints it as output to the user.
import java.util.*;

public class areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius;
        System.out.print("Enter Radius of Circle:");
        radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println("Radius of circle is :" + radius);
        System.out.println("Area of Circle is:" + area);

    }
}
