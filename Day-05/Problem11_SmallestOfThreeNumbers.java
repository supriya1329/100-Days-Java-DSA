 
/*11. Find the smallest of three numbers. */
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd num :");
        int b=sc.nextInt();
        System.out.println("Enter 3rd num :");
        int c=sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("A is smallest num:"+a);
        }
        else if(b<=a && b<=c){
            System.out.println("B is smallest num:"+b);
        }
        else{
            System.out.println("C is smallest num:"+  c);
        }
        sc.close();
    }
}