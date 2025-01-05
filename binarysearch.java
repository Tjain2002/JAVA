import java.util.*;
public class binarysearch {

    static boolean binary(int arr[],int s,int e,int target)
    {
               int mid=(s+e)/2;
               while(s<e)
               {
                if(arr[mid]==target)
                {
                    return true;
                }
                if(target>arr[mid])
                {
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
                mid=(s+e)/2;
               }
               return false;
    }
    public static void main(String[]args)
    {
          int arr[]={2,6,7,8,10,11,34};
          int s=0,e=arr.length;
          int target;
           Scanner sc= new Scanner(System.in);
           System.out.println("enter the value of target");
           target=sc.nextInt();
           boolean ans=binary(arr,s,e,target);
           if(ans)
           {
            System.out.println("target is found");
           }
           else{
            System.out.println("target is not found");
           }
          
    }
    
}
