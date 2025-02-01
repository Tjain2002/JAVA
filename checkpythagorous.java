import java.util.*;

public class checkpythagorous {

    public static boolean ispythagorous(int arr[])

    {

        int a = 0, b = 0, c = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] * arr[i] + arr[j] * arr[j] != arr[k] * arr[k]) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int arr[] = {10,4,6,12,5 };
        boolean ans = ispythagorous(arr);
        if (ans) {

            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
