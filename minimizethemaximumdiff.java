public class minimizethemaximumdiff {

    public static void finddiff(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int arr1[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                arr1[k++] = arr[i] - n;
            } else {
                arr1[k++] = arr[i] + n;
            }

        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            } else if(arr1[i]>max) {
                max = arr1[i];
            }
        }
        System.out.println(max-min);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5,8, 10 };
        int k = 2;
        finddiff(arr, k);
    }

}
