class LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void mul(Node head1, Node head2) {
        int t1 = 0;
        int t2 = 0;
        while (head1 != null) {
            t1 = 10 * t1 + head1.data;
            head1 = head1.next;
        }
       
        while (head2 != null) {
            t2 = 10 * t2 + head2.data;
            head2 = head2.next;
        }
        System.out.println(t1*t2);
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(1);
        a.next = b; 
        b.next = c;

        Node d = new Node(1);
        Node e = new Node(2);
        d.next = e;

        mul(a, d);

    }
}