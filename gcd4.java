import java.util.*;

public class gcd4 {

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }

        else if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int gcd = gcd(a, b);
        // System.out.println(gcd);
        String str ="tanu jain";
        char ch= str.charAt(0);
        String str1= str.trim();


    System.out.println(" "+str);
    
    System.out.println(" "+str1);

        
        // System.out.println(str1[0]);

    
    

    }

}
