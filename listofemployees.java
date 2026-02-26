import java.util.*;

public class listofemployees {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print(i + ".Enter Employee number");
            int Eno = sc.nextInt();
            System.out.print(i + ".Enter name :");
            String ename = sc.next();
            System.out.print(i + ".Enter Salary");
            int salary = sc.nextInt();
            System.out.print(i + ".Enter departmemt no");
            int deptno = sc.nextInt();
            System.out.println(i + ".Employee number is :" + Eno);
            System.out.println(i + ".Name is :" + ename);
            System.out.println(i + ".Salary:" + salary);
            System.out.println(i + ".Department Number is :" + deptno);
        }
    }
}