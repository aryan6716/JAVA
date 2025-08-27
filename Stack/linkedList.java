package Stack;

public class linkedList {
    //new data type
    public static class Node{
       int data; //actual data
       Node next; //address

       //constructor
       Node(int data){
        this.data = data;
       }
    }
    static class stack{
        static Node head = null;

        public static boolean isempty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            
            if(isempty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop 
        public static int pop(){

            if(isempty()) return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){

            if(isempty()) return -1;

            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1); s.push(2); s.push(3);
        
        while(!s.isempty()){
            System.out.println(s.peek());  //gives the top element
            s.pop();  //remove top element

        }
    }
}