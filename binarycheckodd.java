import java.util.*;
public class binarycheckodd {

    public static void checkodd(int n) {
        if ((n & 1) == 1) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n a");
        int n=sc.nextInt();
        checkodd(n);


    }

}
