package Array_List;

import java.util.ArrayList;
import java.util.Collections;
public class sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
         list.add(2);
         list.add(3);
         list.add(1);
         list.add(5);

         Collections.sort(list);
         System.out.println(list);   //ascending

     
         Collections.sort(list,Collections.reverseOrder());
         System.out.println(list);    //decending
    }
}
