public class printprimeno {

    static boolean prime(int n) {

        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
            // return true;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
        if (n < 2) {
            return;
        }

        for (int i = 2; i < n; i++) {
            if (prime(i)) {
                System.out.println(i);
            }

        }

    }
}