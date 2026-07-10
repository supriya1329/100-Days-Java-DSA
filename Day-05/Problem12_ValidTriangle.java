
/*12. Check whether three sides can form a triangle.*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("It is a valid triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
        sc.close();
    }
}