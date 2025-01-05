import java.util.*;

public class LLselectionsort {

    static Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void Sorting(Node head) {
        if (head == null) {
            return;
        }

        Node currnode, index;
        for (currnode = head; currnode != null; currnode = currnode.next) {

        Node min = currnode;
            for (index = currnode.next; index != null; index = index.next) {

                if (index.data<min.data) {

int temp=index.data;
index.data=min.data;
min.data=temp;
                 
                
                    
                }

            }

          

            
        }

        Node temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int data=sc.nextInt();

        LLselectionsort ll = new LLselectionsort();

     

        // int arr[] = { 2, 4, 5, 6, 7 };
        // int find = 90;

        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(5);

        // ll.print();
        // ll.head = ll.recursiveNode(ll.head);

        ll.Sorting(head);
        // ll.print();

        // if(ll.checkpallindrome(head))
        // {
        // System.out.println("given list is pallindrome");
        // }
        // else{
        // System.out.println("given list is not pallindrome");
        // }

    }
}
