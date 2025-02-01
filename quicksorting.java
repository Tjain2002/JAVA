public class quicksorting {
    int sum=0;

    static int parition(int arr[], int low, int high) {
        int pivotele = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivotele) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
            // System.out.println(sum);

        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    static void sort(int arr[], int low, int high) {

        if (low > high) {
            return;
        }

        int pivot = parition(arr, low, high);
        sort(arr, low, pivot - 1);
        sort(arr, pivot + 1, high);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 3, 8, 7 };
        int high = arr.length - 1;
        int low = 0;
        sort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
