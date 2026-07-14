import java.util.scanner;
Public class Copyarray{
    Public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:of elements");
        int n=sc.nextInt();
        System.out.print("Enter elements:");
        int array[]=new int[n];
        int copyarray[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            copyarray[i]=array[i];
        }
        System.out.println("Copied array is:");
        for(int i=0;i<n;i++){
            System.out.print(copyarray[i]+" "); 
        }
        sc.close();
    }
}