import java.util.Scanner;
Public class SmallestElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int smallest=array[0];
        for(int i=1;i<n;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("Smallest element is:"+smallest);
    }
}