/*First 100 units → ₹5/unit
Next 100 → ₹7/unit
Remaining → ₹10/unit*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:of units:");
        int units=sc.nextInt();
        double bill;
        if(units<=100){
            bill =units*5;
        }
        else if(units<=200){
            bill = 100*5+(units-100)*7;
        }
         else{
            bill=100*5+100*7+(units-200)*10;
         }
        System.out.println("Electricity Bill =" + bill);
        sc.close();
    }
}