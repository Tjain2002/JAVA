public class StackImplementationusinglinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   static class stack {

        private Node top;

        stack() {
            this.top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            // newNode.next = top;
            // top = newNode;

            if(top==null)
            {
                // newNode.next=top;
                top=newNode;
                return;
            }
            else

            {
            Node currnode=top;
            while(currnode!=null)
            {
                currnode=currnode.next;
            }
            newNode.next=currnode;
            currnode=newNode;
        
            }


            
            // System.out.println(top.data);

        }

        boolean isempty() {
            return top == null;
        }

        public void pop() {
            if (!isempty()) {
                System.out.println("stack is empty");
            }

            System.out.println("pop data is " + top.data);
            top = top.next;
        }

        public int peek() {

            if (!isempty()) {
                System.out.println("stack is empty");
            }

            return top.data;
        }

        public void display() {
            if (isempty()) {
                System.out.println("cannot print element");
            }
            Node temp = top;
            while (temp != null) {

                System.out.println(temp.data);

                temp = temp.next;

            }

        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(12);
        s.push(34);
        s.push(34);
       s.display();
    //    s.pop();
    //    s.display();
    //    System.out.println("peek element is"+s.peek());



    }
}