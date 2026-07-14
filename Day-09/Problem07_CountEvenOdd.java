import java.util.Scanner;
Public classCountevenodd{
    Public static void main(String args[]){
    Scanner sc=new scanner(System.in);
    System.out.println("Enter no:of elements");
    int n=sc.nextInt(); 
    int array[]=new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        if(array[i]%2==0){
            System.out.println(array[i]+" is even");
        }
        else{
            System.out.println(array[i]+" is odd");
        }
    }
    sc.close();
}