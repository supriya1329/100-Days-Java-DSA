import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive num");
        }
        else if(num<0){
            System.out.println("Negitive num");
        }
        else{
            System.out.println("Netural");
        }
        sc.close();
    }
}