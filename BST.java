import java.util.*;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node insert(Node root, int val) {


      

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currnode = queue.remove();
            if (currnode == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                }
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }

            else {
                System.out.print(currnode.data);
                if (currnode.left != null) {
                    queue.add(currnode.left);
                }

                if (currnode.right != null) {
                    queue.add(currnode.right);
                }
            }
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        else if (key == root.data) {
            return true;
        } else {
            return search(root.right, key);
        }

    }

    public static void printrange(Node root, int x, int y) {

        int cnt=0;
        if (root == null) {
            return;
        }
int sum=0;
        if(x>y)
        {
            System.out.println("enter the valid range");
            return;
        }
        if (x <= root.data && root.data <= y) {
            printrange(root.left, x, y);
            System.out.println(root.data);
            printrange(root.right, x, y);
           

        } else if (x >= root.data) {
            printrange(root.right, x, y);
            
        } else {
            printrange(root.left, x, y);
            
        }
        // System.out.println("cnt="+sum);

    }

public static void printpath(Node root, ArrayList<Integer>path)
{
    

    if(root==null)
    {
        return;
    }
    path.add(root.data);
        if(root.left==null && root.right==null)
        {
            // pathprint(path);
             for(int i=0;i<path.size();i++)
             {
                System.out.print(path.get(i)+" ");
             }
             System.out.println();
            
        }

        else{
            printpath(root.left,path);
            
            printpath(root.right,path);

        }
        path.remove(path.size()-1);
    
}
public static int findmax(Node root)
{
    if(root==null)
    {
        return 0;
    }

    Node currnode=root;
    while(currnode.right!=null)
    {
        currnode=currnode.right;
    }
    return currnode.data;
}


    public static void main(String[] args) {
        Node root = null;

        int arr[] = { 3,4,6,1,10,2 };
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        // inorder(root);
        // levelorder(root);
        // boolean ans = search(root, 1);
        // System.out.println("answer=" + ans);
        printrange(root,2,8);
        //   ArrayList<Integer>ans=new ArrayList<>();
        //   printpath(root, ans);
        int max=findmax(root);
        System.out.println(max);
        
    }

}
