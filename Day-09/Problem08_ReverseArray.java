import java.util.Scanner;
Public classReverseArray{
    Public static void main(String args[]){
    Scanner sc=new scanner(System.in);
    System.out.println("Enter no:of elements");
    int n=sc.nextInt();
    int array[]=new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("Reversed array is:");
    for(int i=n-1;i>=0;i--){
        System.out.print(array[i]+" ");
    }
    sc.close();
}