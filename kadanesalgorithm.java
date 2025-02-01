public class kadanesalgorithm {

public static int find(int arr[])
{
    int max= arr[0];
    int sum= arr[0];
    for(int i=1;i<arr.length;i++)
    {
        max = Math.max(max+arr[i],arr[i]);
        sum = Math.max(sum,max);
    }


// for(int i=0)

return sum;
}

public static void main(String[]args)
{
    int arr[]= {2,-4,-6,7,8};
    int res= find(arr);

    System.out.println(res);
}
    
}