import java.util.*;

public class frequencyofeachnumber {


    public static void main(String[]args)
    {
        
      int arr[]={3,1,4,5,5,6,7};
    //   Arrays.sort(arr);
      int n=arr.length;
      int cnt=1;

      int freq[]=new int[n];
      Arrays.fill(freq,-1);
      for(int i=0;i<n;i++)
      {
        cnt=1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
            cnt++;
            freq[j]=0;

            }
        }

        if(freq[i]!=0)
        {
            freq[i]=cnt;
        }
      }
     

      System.out.println("here is frequency of array");
      for(int i=0;i<n;i++)
      {
        if(freq[i]!=0)
        System.out.println(freq[i]);
      }
          




    }
    
}
