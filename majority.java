public class majority {


public static int num(int arr[])
{
    int c=0,ans=0;
    for(int i=0;i<arr.length;i++)
    {
        if(c==0)
        {
            ans=arr[i];
        }
        if(arr[i]==ans)
        {
            c++;
        }
        else
        {
            c--;
        }
    }
    return ans;
}

    public static void main(String[]args)
    {
int arr[]={2,1,4,1,1,7,2,2,2};
System.out.println(num(arr));
    }
    
}
