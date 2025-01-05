import java.util.*;

public class circularll {

    Node head;
    Node tail;

    circularll() {
        this.head = null;
        this.tail = null;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertatbeg(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;

        }
        tail.next = newnode;
        tail = newnode;
        tail.next = head;

    }

    public Node delete(int data) {
        if (head == null || head.next == null) {
            return null;
        }

        while (head.next != null) {
            if (head.next.data == data) {

                head.next = head.next.next;
                 head=null;

            }
        }

        return head;
    }

    public void display() {
        Node currnode = head;
        if (head == null) {
            // System.out.println("null");
            return;
        }
        do {
            System.out.println(currnode.data);
            currnode = currnode.next;
        }

        while (currnode != head);
    }

    public static void main(String[] args) {
        circularll c = new circularll();
        c.insertatbeg(12);
        c.insertatbeg(22);
        c.insertatbeg(42);
        c.insertatbeg(56);
        c.insertatbeg(78);
        c.insertatbeg(90);
        // c.display();
        c.delete(42);
        c.display();

    }

}
