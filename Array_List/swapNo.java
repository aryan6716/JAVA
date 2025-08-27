package Array_List;

import java.util.ArrayList;

public class swapNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
int temp = list.get(1);
list.set(1, list.get(2));
list.set(2, temp);

System.out.println(list);
    }
}
