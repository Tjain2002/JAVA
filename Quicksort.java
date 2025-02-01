public class Quicksort {

    public static int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quicksort(int arr[], int low, int high) {

        if (low >= high)

        {
            return;
        }
        int pivot = partition(arr, low, high);
        quicksort(arr, low, pivot - 1);
        quicksort(arr, pivot + 1, high);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 7, 4, 3 };
        int high = arr.length - 1;
        int low=0;
        quicksort(arr,low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

}
