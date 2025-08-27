package LinkedList;

public class basics2 {
    //new data type
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
      a.next = b;
      System.out.println(a.next); //Node@251a69d7
      System.out.println(b);  //Node@251a69d7
      System.out.println(b.data);//2
      System.out.println(a.next.data);//2
      //1->2
    }
}
