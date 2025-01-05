public class doublyllinsertanddeleteatbeg {

    static Node head;
    static Node tail;

    public class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public void insertatbeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        newnode.prev = null;
        head.prev = newnode;

        head = newnode;
    }

    public void display() {

        if (head == null) {
            return;
        }
        Node currnode = head;

        while (currnode != null) {
            System.out.print(currnode.data+" ->");
            currnode = currnode.next;
        }
        System.out.println("END");

    }

    public void printreverse()
    {
        Node newnode =tail;
        
        newnode=null;
        while(newnode!=null)
        {
            System.out.println(newnode.data);
            newnode=newnode.prev;
        }
    }

    public Node deleteatfirst() {
        if (head == null) {
            return null;
        }
        Node currnode = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;

    }

    public static void main(String[] args) {
        doublyllinsertanddeleteatbeg ll = new doublyllinsertanddeleteatbeg();
        ll.insertatbeg(23);

        ll.insertatbeg(13);
        ll.insertatbeg(10);
        ll.insertatbeg(23);
        ll.insertatbeg(67);
        // ll.display();
        ll.deleteatfirst();
        ll.display();
        ll.printreverse();

    }
}
