import java.util.*;
public class selectionsort {
 static  void sort1(int arr[])
 {
    int min;
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        min=i;
        for(int j=i+1;j<n;j++)
        {

            if(arr[j]<arr[min])
            {
                int temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp;
            }
            
          
        }
        
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]);
    }
 }


    public static void main(String[]args)
    {
              int arr[]={2,1,5,6,7,12};
              sort1(arr);

    }
    
}
