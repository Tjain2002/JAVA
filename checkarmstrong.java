import java.util.*;
public class checkarmstrong {
    public static void main(String[]args)

    {
              Scanner sc=new Scanner(System.in);
              int n,sum=0,n1,rem;
              System.out.println("enter the value of n");
              n=sc.nextInt();
              n1=n;
              while(n!=0)
              {
                   rem=n%10;
                   sum=rem*rem*rem+sum;
                   n=n/10;
              }
              if(sum==n1)
              {
                System.out.println("given number is armstrong");
              }
              else{
                System.out.println("given number is not armstrong");
              }


    }
    
}
