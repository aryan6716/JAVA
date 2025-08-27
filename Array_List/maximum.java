package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class maximum {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
