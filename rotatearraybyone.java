public class rotatearraybyone {
    public static void main(String[]args)
    {
        int arr[]={1,2,3,5,7};
        int n=arr.length;
        int last_ele=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
        arr[i]=arr[i-1];
    }
    arr[0]=last_ele;
    for(int i=0;i<5;i++)
    {
        System.out.print(arr[i]+"->");
    }
    }

    
}
