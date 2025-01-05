import java.util.*;
class sort {
    public static void main(String []args)
    {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of n");
             int n=sc.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<n;i++)
             {
                arr[i]=sc.nextInt();
             }
             Arrays.sort(arr);
             for(int i=0;i<n;i++)
             {
                System.out.println(arr[i]);
                
             }


    }
}
