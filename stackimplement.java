public class stackimplement {

    public static class Stack {

        static int n = 5;

        static int arr[] = new int[n];
        static int top = -1;

        static boolean isfull() {
            return top == n - 1;
        }

        static boolean isempty() {
            return top == -1;
        }

        public static void add(int data) {

            if (isfull()) {
                System.out.println("stack is full");
                return;
            } else {
                arr[++top] = data;

            }

        }

        public static int remove() {
            int ele;

            if (isempty()) {
                System.out.println("stack is empty");
                return 0;
            }

            return arr[top--];

        }

        public static int print() {
            if (isempty()) {
                System.out.println("stack is empty");
                return 0;
            }

          return arr[top];

        }
    }

    public static void main(String[] args) {

        // stackimplement s= new Stack();
        Stack s = new Stack();
        s.add(10);

        s.add(20);
        s.add(21);
        s.add(22);

        s.add(23);
        // s.remove();

        while (!s.isempty()) {
            System.out.println(s.print());
            s.remove();
        }

    }

}
