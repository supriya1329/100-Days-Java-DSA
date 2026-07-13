import java.util.Scanner;
public class PowerMethod {
    static int power(int base, int exponent) {
        int result=1;
        for (int i=1;i<=exponent;i++)
            result*=base;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base=sc.nextInt();
        System.out.print("Enter Exponent: ");
        int exponent=sc.nextInt();
        System.out.println("Result=" + power(base, exponent));
        sc.close();
    }
}