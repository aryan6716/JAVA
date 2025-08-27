package LinkedList;

public class part_two {

    public static Node nthNode(Node head,int n) {
        Node slow = head;
        Node fast = head;

        for(int i =0;i<n;i++) {
            fast = fast.next;
    }
        while(fast!=null){
                 slow = slow.next;
                 fast = fast.next;
        }
        return slow;
    }
    public static class Node{
       int data; //actual data
       Node next; //address

       //constructor
       Node(int data){
        this.data = data;
       }
    }

   
    public static void main(String[] args) {
        Node a = new Node(1);  //object 
        Node b = new Node(2);  //object 
        Node c = new Node(3);  //object 
        Node d = new Node(4);  //object 
        Node e = new Node(5);  //object 
        a.next=b;  
        b.next=c; 
        c.next=d;  
        d.next=e;

        Node temp = nthNode(a,3);

        System.out.print(temp.data);
    }
}
