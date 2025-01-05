import java.util.*;
public class populatethearray {

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
      
        int arr[]={-2,-4,-6,2,3,10,11};
      ;int k=0,i=0,n=arr.length;
      int arr1[]=new int[n];
    Arrays.sort(arr);
   
    for( i=0;i<n;i++)
    {
          if(arr[i]%2!=0)
          {
            arr1[k]=arr[i];
            k++;
          }
    }
   for( i=n-1;i>=0;i--)
   {
              if(arr[i]%2==0)
              {
                arr1[k]=arr[i];
                k++;
              }
   }

    for( i=0;i<n;i++)
    {
System.out.print(arr1[i]+" ");
    }

    }
}