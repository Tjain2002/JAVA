import java.util.*;

public class countcarry {

    public static int ans(int num1, int num2) {
        int sum = 0;
        int rem1 = 0, rem2 = 0;
        int c = 0;
        while (num1 != 0 &&num2 != 0) {
            rem1 = num1 % 10;
            rem2 = num2 % 10;
            sum = c+rem1 + rem2 ;
            if (sum > 9) {
                c = 1;
                c++;
                // System.out.println(c);
            } else {
                c = 0;
                num1 = num1 / 10;
                num2 = num2 / 10;

            }

            // System.out.println(c);
        }
        System.out.println(c);
        return c;

    }

    public static void main(String[] args) {

        int num1 = 234;
        int num2 = 456;
        int n = ans(num1, num2);
        System.out.println("n=" + n);
        HashSet<Integer>set=new HashSet<>();
        set.add(2);
        set.add(10);
        // collections.sort()
    }

}
