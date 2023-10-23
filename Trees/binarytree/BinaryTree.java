import java.util.*;

class BinaryTree {
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

    static int idx = -1;

    public static Node buidTheTree(int arr[]) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left = buidTheTree(arr);
        newNode.right = buidTheTree(arr);

        return newNode;
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(Node root) {

        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                } else {
                    break;
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static int sumAtKthLevel(Node root, int level) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int sum = 0;
        int count = 1;
        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                count++;
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                } else {
                    break;
                }
            } else {
                if (count == level) {
                    sum = sum + currentNode.data;
                }
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = buidTheTree(Nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(sumAtKthLevel(root,3));
        
    }
}