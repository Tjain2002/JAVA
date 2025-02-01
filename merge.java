import java.util.*;

public class merge {

    public static void merge(int arr[], int s, int mid, int e) {
        int s1 = mid + 1;
        int s2 = s;

        ArrayList<Integer> ans = new ArrayList<>();
        while (s2 <= mid && s1 <= e) {
            if (arr[s2] < arr[s1]) {
                ans.add(arr[s2]);
                s2++;

            }

            else {
                ans.add(arr[s1]);
                s1++;
            }
           

        }

        while (s2 <= mid) {
            ans.add(arr[s2]);
            s2++;
        }

        while (s1 <= e) {
            ans.add(arr[s1]);
            s1++;
        }

        for (int i = 0; i < ans.size(); i++) {
            arr[s + i] = ans.get(i);
        }

    }

    public static void partition(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        partition(arr, s, mid);
        partition(arr, mid + 1, e);
        merge(arr, s, mid, e);

    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 4, 5, 2, 8, 6 };

        int s = 0, e = arr.length - 1;
        partition(arr, s, e);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
