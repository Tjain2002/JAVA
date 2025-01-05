public class sortusingrecursion {
    static void sort(int arr[],int n)
    {
              if(n==0)
              {
                return;
              }
             
             for(int i=0;i<n-1;i++)
             {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
             }
             
 sort(arr,n-1);                      

    }
    public static void main(String[]args)
    {
        int arr[]={2,1,4,3,6};
        int n=5;
        sort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    

}
