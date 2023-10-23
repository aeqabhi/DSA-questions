class CountofNodes {
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

    public static Node buildTheTree(int Nodes[]) {
        idx++;
        if (Nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(Nodes[idx]);
        newNode.left = buildTheTree(Nodes);
        newNode.right = buildTheTree(Nodes);

        return newNode;
    }

    public static int counter(Node root) {

        if (root == null) {
            return 0;
        }

        int leftNodesCount = counter(root.left);
        int rightNodesCount = counter(root.right);

        return leftNodesCount + rightNodesCount + 1;
    }

    public static int SumofNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int left = SumofNodes(root.left);
        int right = SumofNodes(root.right);

        return left + right + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(left, right));
    }

    public static boolean isIdentical(Node root, Node subroot) {
        if(root==null && subroot==null){
            return true;
        }
        if(root==null  || subroot==null){
            return false;
        }
        if(root.data == subroot.data){

            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
        
    }   

    public static boolean subtree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = buildTheTree(Nodes);
        System.out.print(root.data);

        System.out.println();
        System.out.println(counter(root));
        System.out.println(SumofNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));

        

    }
}
