
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class insertdataatgivenpos {

    public static void insert(Node head, int data, int pos) {
        Node newNode = new Node(data);
        Node currnode = head;
        if (pos < 1) {
            System.out.println("positionn should be positive");
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        }
        for (int i = 1; i < pos - 1 && currnode != null; i++) {
            currnode = currnode.next;
        }

        if (currnode == null) {
            System.out.println("position is out of the range");
            return;
        }
        currnode.next = newNode;
        newNode.next = currnode.next;
        

    }

    public static void print(Node node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print("END");

    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(12);

        node.next.next = new Node(12);
        node.next.next.next = new Node(12);

          insert(node,23,13);
          print(node);
    }

}
