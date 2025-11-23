package LinkedList;

public class displayLinkedList {

    public static class Node {
        int data; // actual data
        Node next; // address

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(head.data);// 1 means head preserved
    }

    public static void displayListRecursively(Node head) {
        if (head == null) { // base case
            return;
        }
        System.out.print(head.data + " ");
        displayListRecursively(head.next);
    }

    public static void displayListReverse(Node head) {
        if (head == null) { // base case
            return;
        }
        displayListReverse(head.next);
        System.out.print(head.data + " "); //// print after recursion

    }

    public static void length(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("Length of Linked List: " + length);
    }

    public static void main(String[] args) {
        Node a = new Node(1); // head node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4); // tail node

        a.next = b;
        b.next = c;
        c.next = d;

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);

        // when length is known
        // Node temp = a; //to preserve head
        // for(int i=1;i<=4;i++){
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // when length is not known
        // Node temp = a;
        // while(temp!=null){
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // displayList(a);
        // length(a);
        // displayListRecursively(a);
        // displayListReverse(a);
    }
}
