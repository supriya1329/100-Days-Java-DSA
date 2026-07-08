import java.util.Scanner;
public class Problem09_StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA : " + cgpa);
        sc.close();
    }
}