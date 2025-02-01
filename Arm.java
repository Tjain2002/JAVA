import java.util.*;

public class Arm {


    // public static void checkarmstrong

    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int rem=0;
    int n1=n;
    int sum=0;


    
    while(n!=0)
    {
        rem=n%10;
        n=n/10;
        sum=rem*rem*rem+sum;

    }
    if(sum==n1)
    {
        System.out.println("armstrong");
    }
    else{
        System.out.println("no armstrogn");
    }

    }
    
}
