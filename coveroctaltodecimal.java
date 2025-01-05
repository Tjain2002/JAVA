public class coveroctaltodecimal {

    public static int decimal(int n) {
        int rem, ans = 0, pow = 1;

        while (n != 0) {
           

            rem = n % 10;
            ans = (rem * pow) + ans;
            pow = pow * 8;
            n = n / 10;

        }
        return ans;

    }

    public static void main(String[] args) {

        int n = 23;

        System.out.println("answer=" + decimal(n));
    }

}
