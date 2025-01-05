
import java.util.*;

public class union1{

public static void findunion(int a[],int b[] )
{
    HashSet<Integer>set1=new HashSet<>();

int n=a.length+b.length;

           int arr[]=new int[n];
           int k=0;
           for(int i=0;i<a.length;i++)
        {
            arr[k++]=a[i];
        }
        for(int j=0;j<b.length;j++)
        {
            arr[k++]=b[j];
        }


       /* for(int i=0;i<arr.length;i++)
        {
                        set1.add(arr[i]);
        }
    for(int i=0;i<set1.size();i++)
    {
        //System.out.println(set1);
    }

    }









    public static void main(String[]args)
    {
       int a[] = {1, 2, 3, 2, 1}, b[] = {3, 2, 2, 3, 3, 2};
       findunion(a, b);


    }

    
}



      
           

            

          
          
                            

                
            
                
            
        

      
            
        

    

