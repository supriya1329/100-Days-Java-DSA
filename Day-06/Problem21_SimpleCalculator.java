import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any symbol");
        char op=sc.next().charAt(0);
        System.out.println("Enter nums:");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        switch(op){
        case '+': System.out.println("Result="+(num1+num2));
                break;
        case '-': System.out.println("Result="+(num1-num2));
                break;     
        case '/': System.out.println("Result="+(num1/num2));
                break;
        case '%': System.out.println("Result="+(num1%num2));
                break;
        case'*': System.out.println("Result="+(num1*num2));
                break;
                default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}