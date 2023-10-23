import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Merge {
    static class Node {
        int data;
        Node next;

        Node(int data) {
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

    public static void merge(Node head1, Node head2) {
        List<Integer> l= new ArrayList<>();
        while(head1!=null){
            l.add(head1.data);
            head1 = head1.next;
        } 
        while(head2!=null){
            l.add(head2.data);
            head2 = head2.next;
        } 
        Collections.sort(l);

        Node result = new Node(-1);
        Node temp = result;
        for(int i = 0;i<l.size();i++){
            result.next = new Node(l.get(i));
            result = result.next;
        }
        temp = temp.next;
        printList(temp);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(13);
        a.next.next.next = new Node(20);

        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(10);
        b.next.next.next = new Node(15);

        printList(a);
        System.out.println("");
        printList(b);
        System.out.println("");
        merge(a, b);
    }
}