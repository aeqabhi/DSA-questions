//with no extra space
class CheckPalindrom {
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

    public Node MiddleNum(Node head) {
        Node temp = head;
        Node temp2 = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size = size + 1;
        }
        // System.out.print(size/2);
        for (int i = 1; i < size / 2; i++) {
            temp2 = temp2.next;
        }
        return temp2.next;
    }

    public Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return null;
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

    public boolean palindrome(Node firstNode, Node lastNode) {
        while (lastNode != null) {
            if (firstNode.data != lastNode.data) {
                return false;
            }
            firstNode = firstNode.next;
            lastNode = lastNode.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        CheckPalindrom LL = new CheckPalindrom();
        LL.printLL(a);
        Node secondListStart = LL.MiddleNum(a);
        Node secondListEnd = LL.Reverse(secondListStart);

        System.out.println();
        System.out.println(LL.palindrome(a,secondListEnd)); 
    }
}
