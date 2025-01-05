public class circularqueue {

    static class circular {

        static int size;

        static int front = -1;
        static int rear = -1;
        static int arr[];

        circular(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isempty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return (rear + 1) % size == front;
        }

        public static void enqueue(int data) {
            if (isfull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int dequeue() {
            if (isempty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int ans = arr[front];
            if (rear == front) {
                rear = front = -1;

            } else {
                front = (front + 1) % size;

            }
            return size;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int ans = arr[front];
            return ans;
        }

    }

    public static void main(String[] args)

    {
        circular c = new circular(5);
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(23);
        c.enqueue(21);
        c.enqueue(50);
        c.dequeue();
        c.enqueue(89);
        c.dequeue();
        while (!c.isempty()) {
            System.out.println(c.peek());
            c.dequeue();
        }
    }
}
