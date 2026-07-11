import java.util.Scanner;
public class LicenseEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        System.out.print("Do you have Aadhaar?: ");
        boolean hasAadhaar = sc.nextBoolean();
        if (age >= 18 && hasAadhaar) {
            System.out.println("Eligible to Apply for Driving License.");
        } else {
            System.out.println("Not Eligible for Driving License.");
        }
        sc.close();
    }
}