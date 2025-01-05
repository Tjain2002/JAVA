import java.util.*;

public class pushAtbottom {
    public static void bottompush(int data, Stack<Integer> s)

    {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        bottompush(data, s);

        s.push(top);

    }
    public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return ;
        }
        int top=s.pop();
        reverse(s);
        bottompush(top, s);
    }
    public static void main(String[]args)

    {
        Stack<Integer>s=new Stack<>();
        {
            s.push(10);
            s.push(20);
            s.push(30);
            int data;
          
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value of data");
            data=sc.nextInt();
            bottompush(data, s);
            reverse(s);
            while(!s.isEmpty())
            {
                System.out.println(s.peek());
                s.pop();
                
            }
        }
    }
}
