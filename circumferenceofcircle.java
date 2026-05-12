
//4.	Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

public class circumferenceofcircle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius OF Circle:");
        double r = sc.nextDouble();
        double c = 2 * 3.14 * r;
        System.out.print("The Circumference of Circle is : " + c);
        sc.close();
    }
}