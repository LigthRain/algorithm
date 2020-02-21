package tree;

public class BinarySearchTree {

    class Node {
        int key;
        int value;
        Node right;
        Node left;

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }

    private static Node insert(Node root, Node key) {
        if (root == null) {
            return key;
        }
        if (root.getKey() == key.getKey()) {
            root.value = key.value;
        } else if (key.key > root.key) {
            root.setRight(insert(root.right, key));
        } else {
            root.setLeft(insert(root.left, key));
        }
        return root;
    }

    private static Node search(Node root, Node key) {
        if (key.key > root.key) {
            return search(root.getRight(), key);
        } else if (key.key < root.key) {
            return search(root.getLeft(), key);
        } else if (root.key == key.key) {
            return root;
        } else {
            return null;
        }
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

}
