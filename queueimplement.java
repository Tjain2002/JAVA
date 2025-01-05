public class queueimplement {
    static class queue {
        // static int data;
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int size) {
            arr = new int[size];
            this.size = size;

        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;

        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];

        }

    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.enqueue(10);
        q.enqueue(12);
        q.enqueue(34);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();

        }

    }

}
