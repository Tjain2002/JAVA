import java.util.Arrays;

public class findduplicates {


    public static int duplicates(int arr[])
    {
        int ans=0;
        int k=0;

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i]==arr[i+1])
            {
                arr[k++]=arr[i];
            }
            
        //   System.out.println(k);
        }
            return k;
    }


    public static void main(String[]args)
    {
          
int arr[]={1, 2, 3, 6, 3, 6, 1};

int k=duplicates(arr);

//System.out.println(duplicates(arr));
for(int i=0;i<k;i++)
{
    System.out.println(arr[i]);
}



    }
    
}
