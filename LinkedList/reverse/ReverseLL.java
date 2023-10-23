class ReverseLL {
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

    public Node reverseIteration(Node head) {
        if (head == null || head.next == null) {
            System.out.print("already reverse");
        }
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
    public Node reverserecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverserecursion(head.next);
        head.next.next = head;
        head.next = null;
         
        return newHead;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;

        ReverseLL list = new ReverseLL();
        list.printLL(a);
        
        Node newHead = list.reverseIteration(a);
        System.out.println();
        list.printLL(newHead);
        
        // Node h = list.reverserecursion(h);
        // list.printLL(a);
        
    }
}
