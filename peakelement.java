public class peakelement {
    public static void main(String[]args)

    {
        int arr[]={10, 20, 15, 2, 23, 90, 90};
        int n=arr.length;
        int ans=0,c=0;
        int arr1[]=new int[n];
        int k=0;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i-1]<=arr[i]&& arr[i]>=arr[i+1])
            {
                 arr1[k++]=arr[i];
                 c++;
            }
        }
       for(int i=0;i<c;i++)
       {
        System.out.print(arr1[i]);
       }
    }
}
