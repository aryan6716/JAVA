package LinkedList;

public class NthNodeFromLast {

    public static Node nthNode(Node head,int n) {
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;  //nth from start
        temp = head;
        for(int i =1;i<m;i++) {
            temp = temp.next;
        }
        return temp;
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

        Node temp = nthNode(a,2);

        System.out.print(temp.data);
    }
}
