import java.util.*;

public class BinaryTreePractice1 {

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

    public static void printlevelorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node temp = queue.remove();
                list.add(temp.data);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(34);
        root.left.left = new Node(7);
        root.right.right = new Node(5);
        printlevelorder(root);

    }

}
