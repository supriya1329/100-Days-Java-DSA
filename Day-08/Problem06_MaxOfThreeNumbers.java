import java.util.Scanner;
public class MaxOfThreeNumbers {
    static int max(int a,int b,int c) {
        if (a>=b && a>=c)
            return a;
        else if (b>=a && b>= c)
            return b;
        else
            return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Largest = " + max(a, b, c));
        sc.close();
    }
}