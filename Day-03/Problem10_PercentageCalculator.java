import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Eng marks: ");
        int eng=sc.nextInt();
        System.out.print("Enter Math marks: ");
        int math=sc.nextInt();
        System.out.print("Enter Sci marks: ");
        int sci=sc.nextInt();
        System.out.print("Enter Soc marks: ");
        int soc=sc.nextInt();
        System.out.print("Enter Com marks: ");
        int com=sc.nextInt();
        int total=eng+math+sci+soc+com;
        double percentage= total/5.0;
        System.out.println("Total="+total);
        System.out.println("Percentage ="+percentage+"%");
        sc.close();
    }
}