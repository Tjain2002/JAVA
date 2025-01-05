public class rotatearray1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 7 };
        int k = 0;
        int n = arr.length;
        int temp[] = new int[n];

        int last = arr[n - 1];
        for (int i = n - 1; i >0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
