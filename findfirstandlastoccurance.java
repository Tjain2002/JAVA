import java.util.ArrayList;

public class findfirstandlastoccurance {

    public static ArrayList<Integer> ans(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        if (first == -1 && last == -1) {
            ans.add(first);
            ans.add(last);
        }

        else {
            ans.add(first);
            ans.add(last);

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x = 5;
        // ans(arr,x);
        // // for(int i=0;i<arr.length;i++)
        // {
        // System.out.println(arr[i]);
        // }

        System.out.println(ans(arr, x));

    }
}
