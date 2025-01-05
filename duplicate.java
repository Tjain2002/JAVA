public class duplicate {

    public static int duplicate1(int arr[]) {

        int temp[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[k++] = arr[i];
        }

        arr[k++] = arr[arr.length - 1];
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 7, 8, 9, 9 };
        int n = duplicate1(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
