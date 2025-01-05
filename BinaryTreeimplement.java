
import java.util.*;

public class BinaryTreeimplement {

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

    public static class binarytree {

        static int indx = -1;

        public static Node Tree(int nodes[]) {

            indx++;

            if (nodes[indx] == -1) {
                return null;
            }
            // indx++;
            Node newNode = new Node(nodes[indx]);

            newNode.left = Tree(nodes);
            newNode.right = Tree(nodes);

            return newNode;

        }
    }
    public static void preorder(Node root)
    {
    if(root ==null)
    {
    return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);

    preorder(root.right);
    System.out.println();

    }

    // public static void postorder(Node root)
    // {
    // if(root==null)
    // {
    // return;
    // }

    // postorder(root.left);
    // postorder(root.right);
    // // System.out.println();
    // System.out.print(root.data+" ");
    // // System.out.println();
    // }

    // public static void inorder(Node root)
    // {
    // if(root==null)
    // {
    // return;
    // }
    // inorder(root.left);
    // System.out.print(root.data);
    // inorder(root.right);

    // }
// public static void levelorder(Node root, int k) {
//         if (root == null) {
//             return;
//         }

//         int cnt = 0;
//         int sum = 0;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while (!q.isEmpty()) {
//             Node currNode = q.remove();
//             System.out.println(currNode.data);

//             if (currNode == null) 
            
//             {
//                 System.out.println();
//                 cnt++;
//                 if (cnt == k) {
//                     break;
//                 }

//                 if (!q.isEmpty()) {
//                     q.add(null);
//                 }

//                 if (q.isEmpty()) {
//                     break;
//                 }
//                  else {
//                     q.add(null);
//                 }
//             }          

//             else {
//              System.out.print(currNode.data + " ");

//                 if (cnt == k) {
//                     sum = currNode.data + sum;
//                 }

//                 if (currNode.left != null) {
//                     q.add(currNode.left);
//                 }
//                 if (currNode.right != null) {
//                     q.add(currNode.right);
//                 }
//             }

//         }
//         System.out.println(sum);

//     }

public static void levelorder(Node root, int k) {
    if (root == null) {
        return;
    }

    int cnt = 1;
    int sum = 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null); // Marker for level end

    while (!q.isEmpty()) {
        Node currNode = q.remove();

        if (currNode == null) {
            // End of a level
            System.out.println();
            cnt++;

            // if (cnt == k) {
            //     // If the current level is the target level, stop summing further
            //     break;
            // }

            // Add a marker for the next level if the queue is not empty
            if (!q.isEmpty()) {
                q.add(null);
            }
        } else {
            // Process the current node
            System.out.print(currNode.data);
            if (cnt == k) {
                sum += currNode.data; // Add to sum only if we're at the target level
            }

            if (currNode.left != null) {
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }

    // Print the sum of the k-th level
    System.out.println("Sum of nodes at level " + k + " = " + sum);
}


    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int left = count(root.left);
        int right = count(root.right);
        return left + right + 1;

    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
        return Math.max(lefth, righth) + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytree bt = new binarytree();

        Node root = bt.Tree(arr);
        // System.out.println(root.data);
        // System.out.println("here is preorder");
        // System.out.println();
        // preorder(root);
        // System.out.println("here is postorder");
        // System.out.println();
        // postorder(root);
        // System.out.println("here is inorder ");
        // System.out.println();
        // inorder(root);
        levelorder(root, 2);

        // int cnt = count(root);
        // int sum1 = sum(root);
        // System.out.println("the total number of count is " + cnt);
        // System.out.printf("the sum of nodes is %d ", sum);
        // int h = height(root);
        // System.out.println("height=" + h);

        // // Node head =new Node(3);
        // System.out.println(head.data);
        // levelorder(root);

    }

}
