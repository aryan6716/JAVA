package LinkedList;

public class basics3 {
    //new data type
    public static class Node{
       int data; //actual data
       Node next; //address

       //constructor
       Node(int data){
        this.data = data;
       }
    }

    public static void display_recursively(Node head ){
        if(head==null){
        System.out.println("null");
         return;  //base case
        }
      System.out.print(head.data+"->");
      display_recursively(head.next);
      //System.out.print(head.data+"->");  print LL in reverse
    }
    public static void main(String[] args) {
        Node a = new Node(1);  //object 
        Node b = new Node(2);  //object 
        Node c = new Node(3);  //object 
        a.next=b;  //1->2 3 4
        b.next=c;  //1->2->3 LL


        // System.out.print(a.data+" "); //1
        // System.out.print(a.next.data+" "); //2
        // System.out.print(a.next.next.data+" "); //3


        //or

        // Node temp = a;  //to preserve head
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        //or 

        //recursively
        display_recursively(a);
    }
}
