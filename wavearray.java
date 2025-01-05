import java.util.*;

public class wavearray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the values of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i=i+2)
        {
            if(arr[i-1]<arr[i])
            {
                 temp=arr[i];
                 arr[i]=arr[i-1];
                 arr[i-1]=temp;
            }
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }

}
