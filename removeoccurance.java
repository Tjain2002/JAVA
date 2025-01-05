import java.util.*;

public class removeoccurance {

    public static int occurance(int arr[], int k)

    {
        // Arrays.sort(arr);

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[j++] = arr[i];
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };

        int n = arr.length;
        int k = 2;
        int ans = occurance(arr, 2);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i]);
        }

    }

}
