import java.util.*;

public class queueusingstack {
    static class queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty()&&s2.isEmpty();
        }
        public static void add(int data)
        {



                    //    s1.add(data);
                       while(!s1.isEmpty())
                       {
                        s2.push(s1.pop());



                       }
                       s1.add(data);
                       
                       while(!s2.isEmpty())
                       {
                        s1.push(s2.pop());
                       }
                      
        } 


        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return  -1;
            }
            return s1.pop();
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;

            }
            return s1.peek();
        }

    }

    public static void main(String[]args)

    {
        queue q=new queue();
        q.add(5);
        q.add(12);
        q.add(10);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        





    }
}
