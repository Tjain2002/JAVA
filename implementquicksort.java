public class implementquicksort {


    public static int sort(int arr[],int low,int high)

    {
int i=low-1;
int pivot=arr[high];
for(int j=low;j<high;j++)
{
    if(arr[j]<pivot)
    {
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}
i++;
int temp=arr[i];
arr[i]=arr[high];
arr[high]=temp;
return i;
        

    }

    public static void partition(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return ;

        }
        int pivot=sort(arr,low,high);
        partition(arr,low,pivot-1);
        
        partition(arr,pivot+1,high);

    }

    public static void main(String[]args)
    { 
int arr[]={2,1,4,6,7,3};


        int low=0;
        int high=arr.length-1;
        partition(arr, low, high);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
