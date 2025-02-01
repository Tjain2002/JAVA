import java.util.*;

public class BinarytreeImplementation {

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

    public static class Tree {
        static Node TreeImple(Node root) {
            int data;
            Scanner sc = new Scanner(System.in);
            // System.out.println("enter the data");
            data = sc.nextInt();

            if (data == -1) {
                return null;
            }
            // 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1

            Node newNode = new Node(data);
            System.out.println("enter the data for left tree");

            newNode.left = TreeImple(newNode.left);
            System.out.println("enter the data for right tree");

            newNode.right = TreeImple(newNode.right);

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
            if (currnode == null) {
                System.out.println( );

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                if (queue.isEmpty()) {
                    break;
                }

            }

            else {
                System.out.print(currnode.data+" ");
                if (currnode.left != null) {
                    queue.add(currnode.left);
                }
                if (currnode.right != null) {
                    // System.out.println(currnode.right);
                    queue.add(currnode.right);
                }

            }

        }
    }

    public static void main(String[] args)

    {
        Tree T = new Tree();
        Node root = null;
        root = T.TreeImple(root);
        levelorder(root);

    }
}
