
import java.util.*;

public class medain {

    public static int findmedian(int arr1[], int arr2[]) {
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = {-5, 3, 6, 12, 15};
        int arr2[] = { -12, -10, -6, -3, 4, 10 };
        int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int[n + m];
        int k = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }

        }
        while (i < n) {
            arr3[k++] = arr1[i++];

        }

        while (j < m) {

            arr3[k++] = arr2[j++];

        }

        for (int c = 0; c < arr3.length; c++) {
            System.out.println(arr3[c]);
        }

        int num = arr3.length - 1;
        int mid = 0;
        float medain1 = 0;
        if ((num +1)% 2 == 0)
    {
            medain1=arr3[num/2]+arr3[(num/2)+1];
            // System.out.println("mid value="+medain1);
            medain1=medain1/2;

            // int num1=num/2;

           
           
System.out.println(medain1);

        } else {
            int ans= arr3[(num + 1) / 2];
            System.out.println(ans);
        

           



        }
        // System.out.println("median="+medain1);

    }

}
