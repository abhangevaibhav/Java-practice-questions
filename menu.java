
//3.	 Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//Because marks don’t matter but our effort does.	
//(Hint : use do-while loop but think & understand why)
import java.util.*;

public class menu {
    public static void main(String args[]) {
        System.out.print("Enter 1 to keep taking input or enter 0 to stop:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Vaibhav Abhange");
                break;
            case 0:..
                System.out.print("Stop");
                break;
            default:
                System.out.print("Invalid number");
        }
    }
}