class AA {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    // insertion
    public static Node insertAtfirst(String data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insetAtLast(String data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = newNode;
        return head;

    }

    public static void insertAtandPoint(String data, Node head, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node t = head;
        int i = 0;
        while (i < position - 2) {
            t = t.next;
            i++;
        }
        newNode.next = t.next;
        t.next = newNode;
    }

    // delete
    public static Node deleteAtfirst(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        head = head.next;

        return head;
    }

    public static Node deleteAtLast(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        Node t = head;
        while (t.next.next != null) {
            t = t.next;
        }
        t.next = null;

        return head;
    }
    public static Node deleteAtAnyPoint(Node head,int position){
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return head;
        }

        Node t1 = head;
        int i = 0;
        while(i < position - 2){
            t1 = t1.next;
            i++;
        }
        t1.next = t1.next.next;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node("this");
        Node b = new Node("is");
        Node c = new Node("ram");

        a.next = b;
        b.next = c;
        Node head = a;

        printList(head);

        head = insertAtfirst("first", head);
        head = insertAtfirst("firstOffirst", head);

        insetAtLast("last", head);
        insetAtLast("lastOflast", head);
        head = insertAtfirst("onemorefirst", head);

        insertAtandPoint("middle", head, 2);

        System.out.println("");
        printList(head);

        head = deleteAtfirst(head);
        head = deleteAtLast(head);
        System.out.println("");
        printList(head);

        System.out.println("");
        head = deleteAtAnyPoint(head, 4);
        printList(head);

    }
}