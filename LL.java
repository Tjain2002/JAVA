public class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null)

        {
            head = newNode;
            return;
        }
        // size++;
        newNode.next = head;
        head = newNode;

    }

    public void addend(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (head == null) {
            head = newNode;
            return;
        }
        // size++;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteend() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondNode = head;
        Node lastnode = head.next;
        while (lastnode != null) {
            lastnode = lastnode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;

    }

    public void print() {
        Node currNode = head;
        if (head == null) {
            System.out.println("empty list");
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getsize() {
        return size;
    }

    public void reverselinked() {
        Node prevNode = head;
        Node cuurNode = head.next;
        if (head == null || head.next == null) {
            return;
        }

        while (cuurNode != null) {
            Node nextNode = cuurNode.next;
            cuurNode.next = prevNode;

            prevNode = cuurNode;
            cuurNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node recursiveReverse(Node head)
    {
       if(head==null||head.next==null)
       {
        return head;
       }       
       Node newNode=recursiveReverse(head.next);
       head.next.next=head;
       head.next=null;
       return newNode;


    }
    public static void main(String[] args) {
        LL L = new LL();
        //L.add("my ");
        L.addend("my");
       // L.add("name");
    L.deleteend();
     /*    L.add("name");
        L.add("is");
        L.add("tanisha");*/
        // L.deletefirst();
        // L.print();
        // L.deletefirst();
        // L.print();
        // L.deleteend();
       // L.print();

        //L.reverselinked();
        L.recursiveReverse(L.head);
        L.print();
        // System.out.println(L.getsize());
    }

}
