import java.util.*;
public class bubblesort {
    

void bubble(int arr[])
{
    
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
            int tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
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
            bubblesort b1=new bubblesort();
            Scanner sc=new Scanner(System.in);
            int arr[]={2,6,1,9,5,10};

        


            b1.bubble(arr);

            }
    
}
