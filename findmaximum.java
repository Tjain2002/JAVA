public class findmaximum {

    public static void main(String[]args)
    {
        int arr[]={2,1,4,5,6};
        int max=0;
        int min=-1;
        /*for(int i=0;i<holarr.length;i++)

        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);*/

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("minimum="+min);

    }
    
}
