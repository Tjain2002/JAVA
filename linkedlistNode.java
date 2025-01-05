public class linkedlistNode {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node insertbeg(Node head, int data) {
        // Node currnode=head;
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return head;
        }

        newnode.next = head;
        head = newnode;
        return head;

    }

    public static void print(Node head) {
        Node currnode = head;
        while (currnode != null) {
            System.out.println(currnode.data);
            currnode = currnode.next;
        }

    }

    public static void main(String[] args) {

        linkedlistNode ll = new linkedlistNode();
        int arr[] = { 2, 4, 5, 7, 1 };
        Node head = new Node(12);

        head.next = new Node(1);

        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        // print(head);
        head = ll.insertbeg(head, 90);
        print(head);

        // Node head =new Node(arr[0]);

    }

}
