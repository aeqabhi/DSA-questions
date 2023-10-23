class Checkloop {
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

    public boolean loop(Node head) {

        if (head == null) {
            return false;
        }
        Node turtle = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                noOfNode(hare);
                return true;
            }
        }
        return false;
    }

    public static void noOfNode(Node ptr) {
        Node ptr1 = ptr;
        Node ptr2 = ptr;

        int k = 1;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }
        System.out.println("the number of nodes are" + k);

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        // Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = c;

        Checkloop LL = new Checkloop();
        // LL.printLL(a);
        System.out.println();
        System.out.println(LL.loop(a));
    }
}