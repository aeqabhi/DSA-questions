class Delete{
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.print("null");
    }
    public static void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public static void ddeleteNode(){
        head = head.next;
    }
    public static void main(String[] args) {
        System.out.println(head);
        push(1);
        push(2);
        push(3);
        push(4);

        printList();
        ddeleteNode();
        System.out.println("");
        printList();
    }

}