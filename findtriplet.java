public class findtriplet {


    public static boolean triplet(int arr[],int num)
    {
for(int i=0;i<arr.length-2;i++)
{
    for(int j=i+1;j<arr.length;j++)
    {
        for(int k=j+1;j<arr.length;j++)
        {
                  if(arr[i]+arr[j]+arr[k]==num)
                  {
                   return true;           
                  }
        }
    }
}
return false;
    }
    public static void main(String[] args)
    {
        int arr[]={1,3,4,6,7};
        int num=14;
        boolean ans=triplet(arr,num);
        if(ans)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
