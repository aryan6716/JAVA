package LinkedList;

public class removeNthFromLast {

    public static Node RemoventhNode(Node head,int n) {
        Node slow = head;
        Node fast = head;

        for(int i =0;i<n;i++) {
            fast = fast.next;
    }
    if(fast==null) return head.next;

        while(fast.next!=null){
                 slow = slow.next;
                 fast = fast.next;
        }
    slow.next = slow.next.next;
    return head;
    }
    
public static void display(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
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

        display(a);
        System.out.println();

        a = RemoventhNode(a,5);
        display(a);
    }
}