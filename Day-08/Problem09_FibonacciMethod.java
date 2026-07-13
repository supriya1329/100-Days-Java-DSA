import java.util.Scanner;
public class FibonacciMethod {
    static void fibonacci(int n) {
        int first=0;
        int second=1;
        for (int i=1;i<=n;i++) {
            System.out.print(first + " ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Terms: ");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}