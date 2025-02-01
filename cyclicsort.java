import java.math.BigInteger;

public class cyclicsort {
    public static void main(String[]args)
    {
        int arr[]={5,2,1,3,4,6};
        int i=0;
        
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

    
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
    
}
