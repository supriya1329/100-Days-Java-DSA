import java.util.Scanner;
public class Problem10_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();
        int integerValue = (int) number;
        System.out.println("Original Number = " + number);
        System.out.println("After Type Casting = " + integerValue);
        sc.close();
    }
}