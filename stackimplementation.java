
import java.util.*;
public class stackimplementation {
    public static void main(String[]args)
    {
             Stack<Integer>s1=new Stack<>();
             s1.add(12);
             s1.add(23);
             s1.add(90);
             while(!s1.isEmpty())
             {
                System.out.println(s1.peek());
                s1.pop();
             }
    }
    
}
