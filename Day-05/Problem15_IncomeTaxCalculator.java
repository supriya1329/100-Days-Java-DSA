import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        double income=sc.nextDouble();
        double tax;
        if(income<250000)
            tax=0;
        else if(income<=500000)
            tax=(income-250000)*0.50;
        else if(income<=1000000)
            tax=250000+(income-500000)*0.20;
        else
            tax=112500+(income-1000000)*0.30;
    System.out.println("Tax:"+ tax);
    sc.close();
    }
}