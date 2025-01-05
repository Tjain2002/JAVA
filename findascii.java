
import java.util.*;

public class findascii {

    public static void main(String[] args) {
        String str = "hello";
        int index = 0;
        int k = 0;
        List<Integer> ans = new ArrayList<>();
        int arr[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i);
            arr[k++] = index;
        //ans.add();
        

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
