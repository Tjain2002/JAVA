public class insertion {
    public static void sort(int arr[])
    {
            
             for(int i=1;i<arr.length;i++)
             {
                int curr,j=i-1;
                curr=arr[i];
                System.out.println("curr="+curr);
                while(j>=0 && curr<arr[j])
                {
                  arr[j+1]=arr[j];
                  j--;
                }

                arr[j+1]=curr;
             }
    }
    public static void main(String[]args)
    {
        int arr[]={2,1,5,4,6,3};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
