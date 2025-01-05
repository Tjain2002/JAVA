public class mergesort {

    public static void merge(int arr[], int s, int mid, int e) {

        int mergearr[] = new int[e - s + 1];
        int index1 = s;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <=mid && index2 <=e) {
            if (arr[index1] < arr[index2]) {
                mergearr[x++] = arr[index1++];
             

            } else {
                mergearr[x++] = arr[index2++];
               
            }
        }
        while (index1 <= mid) {
            mergearr[x++] = arr[index1++];
           
        }
        while (index2 <=e) {
            mergearr[x++] = arr[index2++];
           

        }
        int j=s;

        for (int i = 0; i < mergearr.length; i++) {
            arr[j] = mergearr[i];
            j++;

        }

    }

    public static void divide(int arr[], int s, int e) {

        if (s >=e) {
            return;
        }
        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 5, 6, 12, 8 };
        int n = arr.length;
        int s=0;
        divide(arr,s, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
