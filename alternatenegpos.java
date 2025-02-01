import java.util.Arrays;

public class alternatenegpos {
    public static void main(String[] args) {
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int n = arr.length;

        int pos[] = new int[n];
        int neg[] = new int[n];
        int k1 = 0, k2 = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[k1++] = arr[i];
            } else {
                pos[k2++] = arr[i];
            }
        }


        // Arrays.equals(arr1,arr2);
        int arr1[] = new int[n];
        int i = 0, j = 0, k = 0;
        boolean positive = true;

        // Alternate between positive and negative numbers
        while (i < k1 && j < k2) {
            if (positive) {
                arr1[k++] = pos[j++];
            } else {
                arr1[k++] = neg[i++];
            }
            positive = !positive;
        }

        // Add remaining negative numbers (if any)
        while (i < k1) {
            arr1[k++] = neg[i++];
        }

        // Add remaining positive numbers (if any)
        while (j < k2) {
            arr1[k++] = pos[j++];
        }

        // Print the rearranged array
        for (int c = 0; c < n; c++) {
            System.out.print(arr1[c] + " ");
        }
    }
}
