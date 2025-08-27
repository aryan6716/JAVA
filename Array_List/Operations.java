/*
✅ Add All Elements from Another Collection
ArrayList<String> list1 = new ArrayList<>();
list1.add("A");
list1.add("B");

ArrayList<String> list2 = new ArrayList<>();
list2.add("C");

list1.addAll(list2); // list1 = ["A", "B", "C"]


✅ 14. Sort the ArrayList
java
Copy
Edit
import java.util.Collections;

Collections.sort(list1); // Sorts in ascending order


✅ 15. Reverse the ArrayList
java
Copy
Edit
Collections.reverse(list1);


✅ 16. Shuffle the ArrayList
java
Copy
Edit
Collections.shuffle(list1); // Random order


✅ 17. Sublist from ArrayList
java
Copy
Edit
List<String> sub = list1.subList(0, 2); // From index 0 to 1


✅ 18. Index of Element
java
Copy
Edit
int index = list1.indexOf("A");    // First occurrence
int last = list1.lastIndexOf("A"); // Last occurrence



✅ 19. Remove All Elements Present in Another List
java
Copy
Edit
list1.removeAll(list2); // Removes all elements in list2 from list1



✅ 20. Retain Common Elements (Intersection)
java
Copy
Edit
list1.retainAll(list2); // Keeps only elements also in list2
 */



package Array_List;
import java.util.ArrayList;
public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();   //Create an ArrayList

    //add operation. -   0(1)
        a.add(1); 
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);   //[1,2,3,4]

        a.add(1,7);
        System.out.println(a); //[1,7,2,3,4]
    
    //get operation by index. -  0(1)
        int element1 = a.get(2);
        System.out.println(element1);   //3

    //remove operation by index. -  0(n)
        a.remove(2);
        System.out.println(a);    //[1,2,4]


    //set element at index operation
        a.set(2,8);
        System.err.println(a);   //[1,2,8]

    //contain element operation
     System.out.println(a.contains(1));  //true
     System.out.println(a.contains(10));  //false


    //size operation
    System.out.println(a.size()); // 4 :Number of elements

    //loop
    for (int num : a) {
    System.out.print(num+" "); // 1 7 8 4
}


    } 
}
