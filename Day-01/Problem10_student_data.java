import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name:");
        String name=sc.nextLine();
        System.out.print("Enter your Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("Start small. Ship something.");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Branch   : " + branch);
        System.out.println("CGPA     : " + cgpa);

        sc.close();s
    }
}