class Removeloop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printLL(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "");
            t = t.next;
        }
    }

    public static Node detectLoop(Node head) {
        if (head == null) {
            return null;
        }
        Node turtle = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return hare;
            }
        }

        return null;
    }

    public static void moveloop(Node head) {
        Node meet = detectLoop(head);
        Node temp = head;
        // System.out.println(meet.data);
        // System.out.println(temp.data);

        while (meet != temp) {
            temp = temp.next;
            meet = meet.next;
        }

        while (temp.next != meet) {
            temp = temp.next;
        }
        temp.next = null;
        return;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        c.next = b;

        // printLL(a);
        System.err.println("");
        moveloop(a);
        printLL(a);
    }

}
