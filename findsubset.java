public class findsubset {

public static void main(String[]args)
{
    int arr[]={1,2,3,4};
    int arr1[]= {1,4};
   int i=arr.length,j=arr1.length;
   while(i<arr.length&&j<arr1.length)
   {
            if(arr1[j]==arr[i])
            {
                j++;
            }
            i++;
   }


      


}
    
}
