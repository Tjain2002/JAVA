public class Bitwisexorofallpairs {


    public static int ans(int arr1[],int arr2[])
    {
        int xor1=0,xor2=0;
        int res=0;
        for(int num1: arr1)
        {
            xor1=xor1^num1;
        }
        for(int num2:arr2)
        {
            xor2=xor2^num2;
        }
        // if(arr2.length%2!=0)
        // {
        //     res=res^xor1;
        //     System.out.println(res);
        // }
        
        // if(arr1.length%2!=0)
        // {
        //     res=res^xor2;
        //     System.out.println(res);
        // }
       
        res=xor1^xor2^res;
        return res;

    }

    public static void main(String[]args)
    { 

        int arr1[]={2,3,4};
        int arr2[]={4,6,2};
        int n=ans(arr1,arr2);
        System.out.println(n);

    }
    
}
