public class findmissinginap {


    public static int missing(int arr[],int n)
    {

        int ans=0;
              for(int i=0;i<arr.length-1;i++)
              {
                if(arr[i+1]-arr[i]!=n)
                {
                    ans=arr[i];


                       
                }
              }

              ans=ans+n;
              return ans;
    }

public static void main(String[] args) {


   int arr[]  = {1, 6, 11, 16, 21, 31};
int d=5;

  int a= missing(arr, d);
  System.out.println("a="+a);

    
}
    
}
