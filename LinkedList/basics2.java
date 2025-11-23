package LinkedList;

public class basics2 {

  public static class Node { // new data type
    int data; // actual data
    Node next; // address

    Node(int data) { // constructor
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(1); // object
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);

    a.next = b; // a->b
    b.next = c; // a->b->c
    c.next = d; ////a->b->c->d

    // System.out.println(a); //LinkedList.basics2$Node@251a69d7
    // System.out.println(a.next); //LinkedList.basics2$Node@7344699f
    // System.out.println(b); //LinkedList.basics2$Node@7344699f
    // System.out.println(c); //LinkedList.basics2$Node@6b95977

    // can access any element of node from only head
    System.out.println(a.data);// 1
    System.out.println(a.next.data);// 2
    System.out.println(a.next.next.data);// 3

  }
}
