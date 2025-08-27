package LinkedList;

public class  insertANDget{ //list node
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }   
    }

public static class linkedList{
   Node head = null;
   Node tail = null;
   int size = 0;

   void addFirst(int data){
    //step1:create new node
    Node newNode = new Node(data);
    
            if(head==null){  //base case:zero node
                head = tail = newNode;
                     return;
            }else{
                
                 newNode.next = head;//linking step. //step2:newnode next=head

                 head = newNode; //step2:head=new node
            }
        size++;   
    }  


   void addLast(int data){
    //step1:create new node
    Node newNode = new Node(data);
    
            if(head==null){  //base case:zero node
                head = tail = newNode;
                     return;
            }else{
                
                 tail.next = newNode;//linking step. //step2:tail next=newNode

                 tail = newNode; //step2:tail=new node
            }
            size++;
    }  

    void insertAt(int idx,int data){
         Node t = new Node(data);
         Node temp = head;

        if(idx<0 || idx>size){
            System.out.println("index out of bound");
            return ;
         }

         else if(idx==size){
             addLast(data);
             return;
         }
         else if(idx==0){
            addFirst(data);
             return;
         }
         size++;

         for(int i=0;i<idx-1;i++){
            temp = temp.next;
         }
         t.next = temp.next;
         temp.next = t;
         size++;
    }

     void display(){
        Node temp = head;
        while(temp!=null){
          System.out.print(temp.data+"->");
          temp = temp.next;
        }
        System.out.print("null\n");
    
    }
    
    void deleteAt(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
          temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    int Atindex(int index){
        Node temp = head;
        for(int i=0;i<=index;i++){
            temp = temp.next;
        }
        size++;
        return temp.data;
    }

    int size(){
    return size;
     }
}
    
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(1);
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(4); 
        ll.display();
        //ll.insertAt(1 ,8);
        //ll.display();
        ll.deleteAt(2);
        ll.display();
        System.out.println("size:"+ll.size());
        //System.out.println("at given index:"+ll.Atindex(1));
    }
}
