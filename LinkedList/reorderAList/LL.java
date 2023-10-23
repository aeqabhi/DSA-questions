class LL {
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
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.println("null");

    }

    static Node reverse(Node head) {
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

    static void reOrder(Node head) {
        // find the middle point in linked list (slow is the middle point)
        Node slow = head, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        // devide the list in two parts
        Node part1 = head;
        Node part2 = slow.next;
        slow.next = null;// this is for the first part of the list;

        part2 = reverse(part2);
        printLL(part1);
        printLL(part2);

        while (part1 != null || part2 != null) {
            if(part1!=null){
                System.out.print(part1.data+" ");
                part1 = part1.next;
            }
            if(part2!=null){
                System.out.print(part2.data+" ");
                part2 = part2.next;
            }
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node head = a;
        printLL(head);
        reOrder(head);

    }
}