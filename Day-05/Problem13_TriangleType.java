/*13. Determine the type of triangle:
Equilateral
Isosceles
Scalenex    */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a==b) && (b==c)){
            System.out.println("Equalateral triangle");
        }
        else if((a==b)||(b==c)||(c==a)){
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalent Triangle");
        }
        sc.close();
    }
}