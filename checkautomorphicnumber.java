
import java.util.*;
public class checkautomorphicnumber {

    public static void automorphic(int n) {
    int n1=n;

        int squ = n1 * n1;
        int pow=1;
       while(n>0)
       {
        pow=pow*10;
        n=n/10;
       }
       int ans=squ%pow;


        //System.out.println(ans);
        if (n1==ans) {
            System.out.println("number is isompophic");
                        
        }
        else{
            System.out.println("number is not isomorphic");
        }


      //  return 0;
    }

    public static void main(String[] args) {
        int n = 7;
        automorphic(n);
    }

}
