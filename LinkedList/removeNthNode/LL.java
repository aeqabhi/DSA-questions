import java.util.Scanner;

class LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int printLL(Node head) {
        Node t = head;
        int size = 0;
        while (t != null) {
            System.out.print(t.data + "->");
            t = t.next;
            size++;
        }
        System.out.print("null");
        return size;
    }

    public static Node removeNnode(Node head, int position,int size) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if(position==1){
            head = head.next;
            return head;
        }
        if(position>size){
            System.out.println("overflow");
            return null;
        }
        int i = 0;
        Node t = head;
        while (i < position - 2) {
            t = t.next;
            i++;
        }
        t.next = t.next.next;

        return head;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;

        Node head = a;
        int size = printLL(head);
        System.out.println("");

        System.out.println("Enter the position that you want to delete---->");
        int position = sc.nextInt();
        head = removeNnode(head, position,size);
        printLL(head);
    }
}