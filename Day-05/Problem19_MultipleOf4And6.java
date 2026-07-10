import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int num=sc.nextInt();
        if (num%4==0 && num%6==0)
            System.out.println("Divisible by 4 and 6:"+num);
        else
            System.out.println("Not divisible by 4 and 6:"+num);
    sc.close();
    }
}