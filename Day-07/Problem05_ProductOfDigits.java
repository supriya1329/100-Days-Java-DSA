import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int product=1;
        while (num!=0) {
            int digit=num%10;
            product*=digit;
            num/=10;
        }
        System.out.println("Product of Digits ="+product);
        sc.close();
    }
}