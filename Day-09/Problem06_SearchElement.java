Public class SearchElement{
    Public static void main (String args[]){
    Scanner sc=new scanner(System.in);
    System.out.println("Enter no:of elements");
    int n=sc.nextInt();
    int array[]=new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i+){
        array[i]=sc.nextInt();
    }
    System.out.println("Enter element to search:");
    int search=sc.nextInt();
    boolean found=false;
    for(int i=0;i<n;i++){
        if(array[i]==search){
            found=true;
            break;
        }
    }
    if(found){
        System.out.println("Element found");
    }
    else{
        System.out.println("Element not found");
    }
    sc.close();
}