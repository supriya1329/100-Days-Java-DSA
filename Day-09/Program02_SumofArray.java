import java.util.Scanner;
Public class SumofArray{
    Public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr=new int[n];
        int sum=0;
        System.out.println("Array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum"+sum);
        sc.close();
    }
}