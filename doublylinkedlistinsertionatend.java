public class doublylinkedlistinsertionatend {
    static Node head;

    public class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public void insertatend(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnode;
        newnode.prev = currnode;

    }

    public Node deleteatend() {
        if (head == null || head.next == null) {
            return null;
        }

        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.prev.next = null;

        return head;

    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        doublylinkedlistinsertionatend dll = new doublylinkedlistinsertionatend();
        dll.insertatend(12);

        dll.insertatend(23);
        dll.insertatend(45);
        dll.insertatend(10);
        dll.insertatend(23);
        dll.insertatend(56);
        dll.insertatend(7);
        dll.insertatend(11);
        dll.insertatend(10);
        System.out.println("here is before deletion");
        dll.display();
        dll.deleteatend();
        System.out.println("here is after deletion");
        dll.display();

    }

}
