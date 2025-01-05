public class swapalternatenumber {
    public static void main(String[]args)
    {
        int arr[]={1,3,4,5,6,1,5,6};
        int temp;
        for(int i=0;i<arr.length-1;i=i+2)
        {
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
