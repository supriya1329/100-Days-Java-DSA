import java.util.Scanner;
Public static void main(String args[]){
    Scanner sc=new scanner(System.in);
    System.out.println("Enter no:of elements");
    int n=sc.nextInt();
    int array=new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    int largest=array[0];
    for(int i=1;i<n;i++){
        if(array[i]>largest){
            largest=array[i];
        }
    System.out.println("Largest element is:"+largest);
    }
}
