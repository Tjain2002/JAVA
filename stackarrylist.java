import java.util.*;

public  class stackarrylist{

public static  class stack {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isempty() {
        return list.size() == 0;
    }

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public static int peek() {
        int top = list.get(list.size() - 1);
        return top;
    }

    }

    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(21);
        s1.push(24);
        s1.push(45);
        while (!s1.isempty())

        {
            System.out.println(s1.peek());

            s1.pop();

        }

    }

}
