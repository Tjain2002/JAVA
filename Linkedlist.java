public class Linkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void print(Node node)

    {
        if (node == null) {
            return;
        }
        Node currNode = node;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }

    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node currNode = head;
        while (currNode != null) {
            Node temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;

        }

        return prev;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 1, 6, 2 };

        // Node newhead = reverse(null);
        // for(int i=0;i<5;i++)
        // {
        // Node head=new Node(arr[i]);
        // print(head);
        // }
        // Node head = new Node(arr[0]);

        // head.next = new Node(arr[1]);
        // head.next.next = new Node(arr[2]);
        // head.next.next.next = new Node(arr[3]);
        // head.next.next.next.next = new Node(arr[4]);
        // head=reverse(head);
        // print(head);
        Node head = null;
        for (int i = 0; i < 5; i++) {
            Node newnode = new Node(arr[i]);
            if (head == null) {

                head = newnode;

            } else {
                newnode.next = head;
                head = newnode;
            }
        }
     print(head);
        // head = reverse(head);
        // print(head);

    }

}
