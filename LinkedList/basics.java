package LinkedList;

public class basics {
    // new data type
    public static class Node {
        int data; // actual data
        Node next; // address
    }

    public static void main(String[] args) {
        Node x = new Node(); // object
        System.out.println(x.data); // 0 : default value
        System.out.println(x.next); // null
    }
}

/*
 drawback of linked list:
: t occupy two spaces data(int) and next(address)
: a->b->c->d suppose take node b from this we can find only c and d never a
 */

/*
linked list with next=null this will be the tail of list bcz last element always points null
by defalt each node points the null before linking
 */