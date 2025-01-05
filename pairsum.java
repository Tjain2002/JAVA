import java.util.*;

public class pairsum {
    public static int addpair(int arr[], int n, int target) {
        int c = 0;
       int answer=0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                answer=arr[i]+arr[j];
                if (answer == target) {
                    c++;
                }
                System.out.println("answer="+answer);
            
            }
        // System.out.println("answer="+answer);

        }
    
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

       
        int arr[] = new int[n];
System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = addpair(arr, n, target);
       System.out.println("answer=" + ans);

    }

}
