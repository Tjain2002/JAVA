public class Findsquareroot1 {

    public static int findroot(int n) {
        int s = 0, e = n;
        int ans = 0;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                s = mid + 1;
                ans = s;

            } else {
                e = mid - 1;
            }

            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int root = findroot(n);

        System.out.println(root);
    }

}
