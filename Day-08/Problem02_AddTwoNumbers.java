import java.util.Scanner;
public class AddTwoNumbers {
    static int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.println("Sum="+add(a,b));
        sc.close();
    }
}