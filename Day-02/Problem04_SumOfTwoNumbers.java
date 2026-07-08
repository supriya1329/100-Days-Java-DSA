import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum"+"="+sum);
        sc.close();
    }
}