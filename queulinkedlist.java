public class queulinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }

    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isempty() {
            return head == null && tail == null;
        }

        public static void enqueue(int data) {

            Node newNode = new Node(data);

            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        public static int dequeue() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            } else {
                return head.data;
            }

        }
    }
    

        public static void main(String[] args) {
            queue q = new queue();
            q.enqueue(23);
            q.enqueue(34);

            q.enqueue(50);
            while (!q.isempty()) {
                System.out.println(q.peek());
                q.dequeue();
            }

        }

    

}
