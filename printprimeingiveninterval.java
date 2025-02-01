import java.util.*;


public class printprimeingiveninterval {


    public static boolean check(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
        
    }

    public static void main(String[]args)
    {
              Scanner sc= new Scanner(System.in);
              int num1=sc.nextInt();
              int num2=sc.nextInt();
              for(int i=num1;i<num2;i++)
              {

                if(check(i))
                {
                    System.out.println(i);
                }

            }
    }
    
}
