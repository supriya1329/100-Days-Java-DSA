import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
            System.out.println(num+"a Three-Digit Number.");
        } else {
            System.out.println(num+"NOT a Three-Digit Number.");
        }
        sc.close();
    }
}