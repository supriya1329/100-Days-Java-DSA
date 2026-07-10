import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a>b && a<c)||(a>c && a<b))
            System.out.println("Second largest element:"+a);
        else if ((b>a && b<c)||(b>c && b<a))
            System.out.println("Second largest element:"+b);
        else
            System.out.println("Second largest element:"+c);
    sc.close();
    }
}