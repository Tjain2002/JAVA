
import java.util.*;
public class pair {

    public static int repeat(int arr[])
    {
int res=arr[0];
int ans=0;
ArrayList<Integer>result=new ArrayList<>();
for(int i=0;i<arr.length;i++)
{


    //res=arr[i];
    res=res^arr[i];
    if(res==0)
    {
        ans=arr[i];

    }
    // else{
    //     res=arr[i];
    // }
}
return ans;


    }
public static void main(String[] args) {
    // int arr[]={1,2,3,4};
    // Arrays.sort(arr);

int arr[]={1,3,4,2,2};

System.out.println(repeat(arr));

    
}
    
    
}
