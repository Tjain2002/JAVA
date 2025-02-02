public class slidingwindow {

    public static int findmax(int arr[],int w)
    {
      int curr=0;
      for(int i=0;i<w;i++)
      {
        curr=arr[i]+curr;
      }
      int max=curr;
      for(int i=1;i<=arr.length-w;i++)
      {
               curr=curr-arr[i-1]+arr[i+w-1];
               if(curr>max)
               {
                max=curr;
               }
      }
      return max;

    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,6,7,5,8,6,12,14,56};
        int w=4;
        int  max=findmax(arr, w);
        System.out.println("maximum sum="+max);
    }
    
}
