import java.util.Scanner;
public class GreatestOfFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int greatest = a;
        if (b > greatest)
            greatest = b;
        if (c > greatest)
            greatest = c;
        if (d > greatest)
            greatest = d;
        System.out.println("Greatest Number="+greatest);
        sc.close();
    }
}