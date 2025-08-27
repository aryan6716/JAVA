package LinkedList;

public class basics {
    //new data type
    public static class Node{
       int data; //actual data
       Node next; //address
    }
    public static void main(String[] args) {
        Node x = new Node();  //object 
       System.out.println(x.data);   //0 : default value
       System.out.println(x.next);   //null
    }
}
