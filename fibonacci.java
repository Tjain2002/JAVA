import java.util.*;
public class fibonacci {


    public static void fib(int n)
    {
        
      
        int a=0,b=1,c=a+b;
        System.out.print(a+" "+b );
        
        while(n>0)
        {
       
           c=a+b;
            a=b;
            b=c;
            n--;
            System.out.print(" "+c+" ");
        
        }
        System.out.println();
        System.out.println("here is c value"+c);
        
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    fib(n);
        //System.out.println(ans);

    }
    
}
