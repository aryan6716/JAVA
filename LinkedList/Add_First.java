package LinkedList;

public class Add_First { // list node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void addFirst(int data) {
            // step1:create new node
            Node newNode = new Node(data);

            if (head == null) { // base case:zero node
                head = tail = newNode;
                return;
            } else {

                newNode.next = head;// linking step. //step2:newnode next=head

                head = newNode; // step2:head=new node
            }
        }

        void display() {
            int size = 0;
            while (head != null) {
                System.out.print(head.data + "->");
                head = head.next;
                size++;
            }
            System.out.print("null\n");
            System.out.println("size:" + size);
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.display();
    }
}
