public class MethodOverloading{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static int add(int a, int b, int c)
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("Addition of Two Integers = " + add(10, 20));
        System.out.println("Addition of Two Doubles = " + add(10.5, 20.8));
        System.out.println("Addition of Three Integers = " + add(10, 20, 30));
    }
}