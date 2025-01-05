
import java.util.*;
public class gcdlcm {

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }
        }

        return b;
    }

    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a and b");
    int a=sc.nextInt();
    int b=sc.nextInt();
   int ans= gcd(a,b);
   System.out.println("gcd="+ans);

    }

}
