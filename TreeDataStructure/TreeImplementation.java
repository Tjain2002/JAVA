import java.util.*;

public class TreeImplementation{

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



public static void levelorder(Node root)
{
  Queue<Node>queue= new LinkedList<>();
  queue.add(root);
  queue.add(null);

  while(!queue.isEmpty())
  {
    Node curNode= queue.poll();
    if(curNode==null)
    {
        // System.out.println();

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
        System.out.print(" "+curNode.data+" ");
        if(curNode.left!=null)
        {
                queue.add(curNode.left);
        }

        if(curNode.right!=null)
        {
            queue.add(curNode.right);
        }
    }
  }
}
public static int sum(Node root)
{
    if(root==null)
    {
        return 0;
    }

    int left= sum(root.left);
    int right=sum(root.right);
    System.out.println("left="+left);
    System.out.println("right="+right);
    return left+right+root.data;
}
public static int count(Node root)
{
    if(root==null)
    {
        return 0;
    }

    
    return  count(root.left)+count(root.right)+1;
}


public static int height(Node root)
{
    if(root==null)
    {
        return -1;
    }
    int left=height(root.left);
    int right=height(root.right);
    return Math.max(left,right)+1;
}

public static void preorder(Node root)
{
    if(root==null)
    {
        return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
}

public static void postorder(Node root)
{
    if(root==null)
    {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
}

public static void inorder(Node root)
{
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
}


public static void invertTree(Node root)
{
     if(root==null)
     {
        return;
     }
     Queue<Node>queue=new LinkedList<>();
     queue.add(root);
     while(!queue.isEmpty())
     {
        Node currnode=queue.poll();
        Node temp=currnode.left;
        currnode.left=currnode.right;
        currnode.right=temp;
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
    public static void main(String[]args)
    {

        Node root= new Node(2);
        root.left= new Node(4);
        root.right=new Node(34);
        root.left.left=new Node(10);
       
        root.right.right=new Node(9);
        levelorder(root);
       int s= sum(root);
       System.out.println(s);
       int cnt=count(root);
       System.out.println(cnt);
       int h=height(root);
       System.out.println(h);
       System.out.println("here is preorder traversal");
       preorder(root);
       System.out.println("here is postorder");
       postorder(root);
       System.out.println("here is inorder traversal");
       inorder(root);
    //    levelorder(root);
    invertTree(root);
    levelorder(root);



    }
}


