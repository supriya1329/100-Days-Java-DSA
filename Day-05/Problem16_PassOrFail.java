import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        if(marks>=75){
            System.out.println("Distiction pass:"+marks);
        }
        else if(marks>=35){
            System.out.println("Pass:"+marks);
        }
        else{
            System.out.print("Fail:"+marks);
        }
    sc.close();
    }
}