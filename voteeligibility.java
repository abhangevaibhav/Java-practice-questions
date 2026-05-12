
//5.	Write a function that takes in age as input and returns if that person is eligible to   vote or not. A person of age > 18 is eligible to vote.
import java.util.*;

public class voteeligibility {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        age = sc.nextInt();
        if (age > 18) {
            System.out.print("You are eligible to vote");
        } else {
            System.out.print("You are not eligible to vote");
        }
    }
}