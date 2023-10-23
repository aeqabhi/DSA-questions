class LastNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printLL(Node head) {
        if (head == null) {
            System.out.print("empty list");
            return;
        }
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.print("null");
    }

    public int removeNodeFromEnd(Node head, int n) {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node temp1 = head;
        while (temp1 != null) {
            temp1 = temp1.next;
            size = size + 1;
        }
        int position = size - n + 1;
        Node temp2 = head;
        for (int i = 0; i < position-2; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return position;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        LastNode LL = new LastNode();
        LL.printLL(a);
        
        System.out.println();
        int position = LL.removeNodeFromEnd(a,4);
        System.out.println("the node is at position from beginning--->"+position);
        LL.printLL(a);
    }
}
