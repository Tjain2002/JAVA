import java.util.*;

public class circularllinsertatbeg {

    Node head;
    Node tail;

    circularllinsertatbeg() {
        this.head = null;
        this.tail = null;
    }

    public class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }

    public void insertatbeg(String data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;

        }

        newnode.next=head;
        head=newnode;
        tail.next=head;
    }

    public Node delete()
    {
        if(head==null||head.next==null)
        {
            return null;
        }

     head=head.next;
     tail.next=null;


    return head;
    }

    public void display() {
        Node currnode = head;
        if (head == null) {
            // System.out.println("null");
            return;
        }
       do{
        System.out.println(currnode.data);
        currnode=currnode.next;
       }

       while(currnode!=head);
    }

    public static void main(String[] args) {
        circularllinsertatbeg c = new circularllinsertatbeg();
        c.insertatbeg("A");
        c.insertatbeg("B");
        c.insertatbeg("C");
        c.insertatbeg("D");
        c.insertatbeg("E");
        c.insertatbeg("F");
        // c.display();
        // c.delete();
        c.display();


    }

}
