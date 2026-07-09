import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first boolean");
        boolean a = sc.nextBoolean();
        System.out.print("Enter second boolean");
        boolean b = sc.nextBoolean();
        System.out.println("AND (&&): " + (a && b));
        System.out.println("OR (||): " + (a || b));
        System.out.println("NOT (!a): " + (!a));
        sc.close();
    }
}