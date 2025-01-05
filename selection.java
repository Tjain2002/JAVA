public class selection {


    static void sort(int arr[])
    {
        int n=arr.length,mid;
        for(int i=0;i<n;i++)
        {
            mid=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mid])
                {

                
                int temp=arr[j];
                arr[j]=arr[mid];
                arr[mid]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
    public static void main(String[]args)
    {
        int arr[]={2,3,1,9,8};
        sort(arr);


    }
    
}
