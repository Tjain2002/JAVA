import java.lang.reflect.Array;

import java.util.*;;

public class productsmallestpair {

   static int sum(int arr[],int sum)
    {
        int min=arr[0];
        int max=arr[1];
        int ans=1;
        if(min+max<=sum)
        {
          ans=min*max;
        }   
        return ans; 
    }  

    public static void main(String[] args) {
        
        int arr[]={5,2,4,1,2};
        Arrays.sort(arr); 
        int ans=sum(arr,7);
        System.out.println(ans);
        
        

        

    }
}