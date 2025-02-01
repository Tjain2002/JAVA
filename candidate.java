import java.util.*;

public class candidate {

    public static List<List<Integer>> ans(int arr[], int target) {

        int sum = 0;
        List<List<Integer>> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) 
        
        // sum=0;

        {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum = arr[i] + sum;
                if (sum == target) {
                    list2.add(sum);
                }
            }
        }

        list1.add(list2);

        return list1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        List<List<Integer>> list = new ArrayList<>();

        list = ans(arr, 7);
        System.out.println(list);

    }

}
