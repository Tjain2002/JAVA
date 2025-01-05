public class covertdecimaltooctal {
    public static int decimal(int n) {
        int ans = 0, rem;
        int power = 1;
        while (n != 0) {

            rem = n % 8;
            ans = (rem * power) + ans;

            // n=n/8;

            power = power * 10;
            n = n / 8;

        }
        // System.out.println(ans);

        /*
         * int rem1,ans1=0;
         * 
         * while(ans!=0)
         * {
         * rem1=ans%10;
         * ans1=(ans1*10)+rem1;
         * ans=ans/10;
         * }
         */
        return ans;
    }

    public static void main(String[] args)

    {
        int n = 23;
        System.out.println(decimal(n));
    }

}
