import java.util.*;
public class strong {


    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void check(int n)
    {

        int n1=n;
        int rem,ans=0;
        while(n!=0)
        {
            rem=n%10;
         ans= fact(rem)+ans;
         n=n/10;

System.out.println("ans="+ans);

        }

        if(ans==n1)
        {
            System.out.println("number is strong");
        }
        else{
            System.out.println("number is not strong");
        }

    }


    public static void main(String[]args)
    {
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               check(n);       
    }
    
}
