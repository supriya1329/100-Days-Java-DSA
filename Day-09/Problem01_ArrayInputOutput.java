import java.util.Scanner;
Public class ArrayinputOutput{
    Public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            int[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Element at index "+i+" is: "+arr[i]);
        }
        sc.close();
    }
}