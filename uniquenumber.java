public class uniquenumber {


    public static int unique(int arr[])
    {
                     int ans=0;
                     for(int i=0;i<arr.length;i++)
                     {
                        ans=ans^arr[i];
                     }
return ans;
    }
    


    public static void main(String[] args) {
     int arr[]={2,1,1,4,4,5,5};
   int ans=  unique(arr); 
   System.out.println(ans);
 
   
     
    }
}
