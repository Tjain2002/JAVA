
import java.util.*;
public class queueusingframework {

    public static void main(String[]args)

    {
          //  Queue<Integer>q=new LinkedList<>();
            Queue<Integer>q=new ArrayDeque<>();
            q.add(20);
            q.add(25);
            q.add(96);
            while(!q.isEmpty())
            {
                System.out.println(q.peek());
                q.remove();
            }

    }
}
