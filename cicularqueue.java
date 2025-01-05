public class cicularqueue {
    static class queue {
        // static int data;
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int size) {
            arr = new int[size];
            this.size = size;

        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;

        }

        public static void enqueue(int data) {
            if (isFull()) {
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
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
            int ans = arr[front];
            if (rear == front) {
                rear = front = -1;

            } else {
                front = (front + 1) % size;
            }
            return ans;

        }

    

    public static int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];

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
