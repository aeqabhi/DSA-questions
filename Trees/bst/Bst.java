import java.util.ArrayList;

class Bst {
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

    // insertion
    public static Node buildBST(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = buildBST(root.left, value);
        } else {
            root.right = buildBST(root.right, value);
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    // deletion

    public static Node inorderSuc(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return delete(root.right, key);
            } else if (root.right == null) {
                return delete(root.left, key);
            }

            // case 3
            Node IS = inorderSuc(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static void printRange(Node root, int a, int z) {
        if (root == null) {
            return;
        }
        if (root.data >= a && root.data <= z) {
            printRange(root.left, a, z);
            System.out.print(root.data + " ");
            printRange(root.right, a, z);
        } else if (root.data >= z) {
            printRange(root.left, a, z);
        } else {
            printRange(root.right, a, z);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i= 0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void leafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            leafPath(root.left, path);
            leafPath(root.right, path);

        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = buildBST(root, value[i]);
        }

        // System.out.println(root.data);

        inorder(root);
        System.out.println();

        // System.out.println(search(root, 10));
        // System.out.println(search(root, 100));

        // delete(root, 4);
        // inorder(root);
        // System.out.println();

        // printRange(root, 3, 10);

        leafPath(root, new ArrayList<>());

    }
}