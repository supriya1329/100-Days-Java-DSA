import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount:");
        double amount=sc.nextDouble();
        double discount;
         if (amount>=5000)
            discount=amount*0.20;
        else if(amount>=3000)
            discount=amount*0.15;
        else if(amount>=1000)
            discount=amount * 0.10;
        else
            discount = 0;
        System.out.println("Discount=₹"+discount);
        System.out.println("Final Amount=₹"+(amount-discount));
    sc.close();
    }
}