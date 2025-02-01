import java.util.*;

class BinaryTreeTraversal {

static class Node{
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

static class BinaryTree{
    static int index=-1;
    public static Node print(int arr[])
    {
        // int index=0;
        index++;
        if(arr[index]==-1)
        {
            return null;
        }
        
         Node newNode =new Node(arr[index]);
         newNode.left= print(arr);
         newNode.right= print(arr);
        
        return newNode;
    }

}



static void preorder(Node root)
{
if(root==null)
{
    return;
}

System.out.println(root.data+" ");
preorder(root.left);
preorder(root.right);
}

public static void levelorder(Node root)
{
if(root==null)
{
    return;
}
Queue<Node>queue=new LinkedList<>();
queue.add(root);
while(!queue.isEmpty())
{
    Node currnode= queue.remove();
    System.out.println(currnode.data);
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


        int arr[]={2,-1,-1};
            //  Node root =new Node(arr);
          
            //  root.left =new Node(12);/
            // Node root=null;

            BinaryTree bt =new BinaryTree();
       Node  root =bt.print(arr);
         System.out.println("here is root data");
         System.out.println(root.data);


            // System.out.println("this is the preorder traversal");
            // preorder(root);
            // System.out.println("this is the level order traversal");
            // levelorder(root);




    }
    
}
