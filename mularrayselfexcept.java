import java.util.*;

public class mularrayselfexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int mul = 1;
        int arr[] = { 1, 2, 3, 4, 5 };

        int n = arr.length;
        int mul[] = new int[n];
             Arrays.fill(mul,1);

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {

                if (i != j) {

                    mul[i] = arr[i] * mul[i];
                }
                

            }
            System.out.println(mul[i]);

        }
       

    }

}
