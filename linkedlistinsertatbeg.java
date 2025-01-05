
import java.util.*;

public class linkedlistinsertatbeg {

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

//    public void deleteatfirst() {
//         if (head == null) {
//             System.out.println("empty list");
//             return;
//         }
//         head = head.next;
//     }

    public void print() {

        int flag = 0;
        Node CurrNode = head;
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }

        while (CurrNode != null) {
            System.out.println(CurrNode.data);
            CurrNode = CurrNode.next;

            // if (CurrNode.data == find) {
            // System.out.println("data is found");
            // flag = 1;

            // }

            // CurrNode = CurrNode.next;

        }

    }

    // public Node checkoddeven(Node head) {
    //     if (head == null) {
    //         return head;
    //     }

    //     Node currnode = head;
    //     Node evennode = new Node(0);
    //     Node oddnode = new Node(0);
    //     Node even = evennode;
    //     Node odd = oddnode;

    //     while (currnode != null) {
    //         if (currnode.data % 2 == 0) {
    //             even.next = currnode;
    //             even = even.next;

    //         } else {
    //             odd.next = currnode;
    //             odd = odd.next;

    //         }

    //         currnode = currnode.next;
    //     }

    //     odd.next = null;
    //     even.next = oddnode.next;

    //     return evennode.next;
    // }

    // public int findsum(Node head) {

    //     Node currnode = head;
    //     // Node sum=new Node(0);
    //     int sum = 0;
    //     while (currnode != null) {

    //         sum = currnode.data + sum;

    //         currnode = currnode.next;

    //     }

    //     return sum;
    // }
    // System.out.println("null");

    /*
     * if (flag == 1) {
     * System.out.println("data is found");
     * } else {
     * System.out.println("data is not found");
     * }
     */

    public Node recursiveNode(Node head) {

    if (head == null || head.next == null) {
    return head;
    }
    Node newNode = recursiveNode(head.next);
    head.next.next = head;
    head.next = null;
    return newNode;

    }

    // public boolean checkpallindrome(Node head) {

    //     if (head == null || head.next == null) {
    //         return true;
    //     }

    //     Node slow = head;
    //     Node fast = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     Node prev = null;
    //     while (slow != null) {
    //         Node temp = slow.next;
    //         slow.next = prev;
    //         prev = slow;
    //         slow = temp;
    //     }

    //     while (prev != null) {
    //         if (head.data != prev.data) {
    //             return false;

    //         }
    //         head = head.next;
    //         prev = prev.next;
    //     }
    //     return true;
    // }

    // public void sorting(Node head) {
    //    Node Currnode, index;
    //    for(Currnode =head;Currnode!=null;Currnode=Currnode.next)
    //    {
    //     for(index=Currnode.next;index!=null;index=index.next)
    //     {
    //         if(Currnode.data>index.data)
    //         {
    //             int temo=Currnode.data;
    //             Currnode.data=index.data;
    //             index.data=temo;

    //         }
    //     }
    //    }

        // Node temp2 = head;
        // while (temp2 != null) {
        //     System.out.println(temp2.data);
        //     temp2 = temp2.next;
        // }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int data=sc.nextInt();

        linkedlistinsertatbeg ll = new linkedlistinsertatbeg();

        // int arr[] = { 2, 4, 5, 6, 7 };
        // int find = 90;

        ll.add(2);
        ll.add(90);
        ll.add(90);
        ll.add(12);
        //  ll.print();
       ll.head= ll.recursiveNode(ll.head);
        ll.print();


        // ll.print();
        // ll.head = ll.recursiveNode(ll.head);
        // ll.checkoddeven(head);
        // // System.out.println("here is linked list sum");
        // int ans = ll.findsum(head);
        // System.out.println("sum=" + ans);
        // // ll.print();
        // ll.sorting(head);
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
