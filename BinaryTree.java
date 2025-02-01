import java.util.*;

public class BinaryTree {

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

    public static class binary {
        // static int i=-1;

        static Node tree(Node root) {
            int data;
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            // i++;
            if (data == -1) {
                return null;
            }

            Node newNode = new Node(data);
            System.out.println("enter the data for left subtree");
            newNode.left = tree(newNode.left);
            System.out.println("enter the data for right subtree");
            newNode.right = tree(newNode.right);

            return newNode;
        }
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // queue.add(null);
        while (!queue.isEmpty()) {
            Node currnode = queue.remove();
            // System.out.println(queue);
            if (currnode == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                }
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                // else{
                // queue.add(null);
                // }

            }

            else {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) {
                    queue.add(currnode.left);
                }
                if (currnode.right != null) {
                    queue.add(currnode.right);
                }
            }
        }

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }

    // find sum
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = count(root.left);
        int rightsum = count(root.right);
        return leftsum + rightsum + root.data;
    }

    // count the number of nodes in a given binary tree
    public static int countnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnode = countnodes(root.left);
        int rightnode = countnodes(root.right);
        return leftnode + rightnode + 1;
    }
    // find the height of the binary tree

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight, rightheight) + 1;
    }

    public static void main(String[] args) {
        // int arr[]={2,3,4,-1,-1,-1,-1};

        binary b = new binary();
        Node root = null;
        root = b.tree(root);

        // //  preorder(root);
        // levelorder(root);
        // // System.out.println(root.data);
        // int sum = count(root);
        // System.out.println("sum=" + sum);

        // int n = countnodes(root);
        // System.out.println("number of nodes =" + n);
        // int h = height(root);
        // System.out.println("height=" + h);

    }

}
