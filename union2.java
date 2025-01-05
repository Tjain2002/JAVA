import java.util.*;
public class union2
{







public static void findunion(int a[],int b[] )
{
    HashSet<Integer>set1=new HashSet<>();

int n=a.length+b.length;

        //   int arr[]=new int[n];
        //   int k=0;
           for(int i=0;i<a.length;i++)
        {
        set1.add(a[i]);
        }
        for(int j=0;j<b.length;j++)
        {
            set1.add(b[j]);
        }

Integer []arr=set1.toArray(new Integer[0]);

         for(int k=0;k<arr.length;k++)

         {
            System.out.println(arr[k]);    

         }
    }

    public static void main(String[]args)
    {
       int a[] = {1, 2, 3, 2, 1};
       int b[] = {3, 2, 2, 3, 3, 2};
       findunion(a, b);


    }



}  

