public class findlen {
    public static void main(String[]args)
    {
        int arr[]={34,5,78,90};
        int rem=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            rem=0;
            c=0;
            while(arr[i]!=0)
            {
                rem=arr[i]%10+rem;
                arr[i]=arr[i]/10;
                c++;

            }
            System.out.println(c);
        }
String name ="";
    }
    
}
