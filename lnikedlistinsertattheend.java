import java.util.*;
public class lnikedlistinsertattheend {





    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addend(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteend() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondNode = secondNode.next;
            lastNode = lastNode.next;
        }

        secondNode.next = null;

    }

  


    public void print() {
        Node cuurNode = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        while (cuurNode != null) {
            System.out.println(cuurNode.data);
           // System.out.println(currNode);
            cuurNode = cuurNode.next;
        }
    }

    public static void main(String[] args) {

        lnikedlistinsertattheend ll=new lnikedlistinsertattheend();
        ll.addend(12);
        ll.addend(23);
        ll.addend(34);
        ll.print();
        ll.deleteend();
        System.out.println("here is deleted linked list");
        ll.print();




    }

}
