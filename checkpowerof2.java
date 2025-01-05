import java.util.*;
public class checkpowerof2 {

    static void power2(int n)
    {
        if((n&n-1)==0)
        {
                  System.out.println("given number is power of 2");
        }
        else{
            System.out.println("given number is not power of 2");
    }
    }

    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    power2(n);
    }
    
}
