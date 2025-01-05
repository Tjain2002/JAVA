public class binarytrrimplementation {

    public static class Node {
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
        static int index = -1;

        public static Node builtree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);

            newNode.left = builtree(nodes);
            newNode.right = builtree(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data+"->");
            preorder(root.left);
            preorder(root.right);

        }
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 ,-1};
        binarytree tree = new binarytree();
        Node root = tree.builtree(nodes);
        //System.out.println(root.data);
       tree.preorder(root);

    }

}
