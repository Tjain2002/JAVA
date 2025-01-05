
import java.util.*;

public class findsquareroot {
    public static int root(int n) {
        int s = 1, e = n;
        int res = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                s = mid + 1;
                res = mid;
            } else {
                e = mid - 1;
            }



        }

    

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = root(n);
        System.out.println(ans);

    }

}
