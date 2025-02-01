import java.util.*;
public class treeimplementattion {


   static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
    {

        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    

public static void levelorder(Node head)
{ 

    if(head==null)
    {
        return;
    }
    Queue<Node>queue=new LinkedList<>();
    queue.add(head);
    queue.add(null);
    while(!queue.isEmpty())
    {
        Node currnode =queue.remove();
        if(currnode==null)
        {
            System.out.println();
            if(queue.isEmpty())
            {
                break;
            }
            if(!queue.isEmpty())
            {
                queue.add(null);
            }
        }
        else{

            System.out.print(currnode.data+" ");
            if(currnode.left!=null)
            {
                queue.add(currnode.left);
            }
            if(currnode.right!=null)
            {
                queue.add(currnode.right);
            }
        }
    }

}
   
    public static void main(String[]args)
    {
              Node head=new Node(1);
              head.left=new Node(2);
              head.right=new Node(3);
              head.left.left=new Node(20);
              head.right.right=new Node(25);
              head.right.right=new Node(34);
              head.left.left.right=new Node(89);
              
              levelorder(head);
            

            

    }

    
}
