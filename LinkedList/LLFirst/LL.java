class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // ==============
    // ==insertion==
    // =============
    public void addFirst(String data) { 
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAnyIndex(String data, int n) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp1 = head;
        Node temp2 = head.next;
        int i = 1;
        while (i < n) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            i++;
        }
        temp1.next = newNode;
        newNode.next = temp2;
    }

    // ==============
    // printLinedList
    // =============
    public void PrintLinedList() {
        if (head == null) {
            System.out.println("the linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ==============
    // ==DEletion==
    // =============
    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node sl = head;
        Node l = head.next;

        while (l.next != null) {
            sl = sl.next;
            l = l.next;
        }
        sl.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("the");
        list.addLast("LinkedList");
        list.addAnyIndex("a", 3);

        list.PrintLinedList();

        list.deleteFirst();
        list.PrintLinedList();
        list.PrintLinedList();
        list.deleteLast();
        list.PrintLinedList();

        System.out.println(list.getSize());
    }
}