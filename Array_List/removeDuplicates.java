package Array_List;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);list.add(3);list.add(2);list.add(4);list.add(5);
        for(int i=0 ; i<list.size() ; i++){
            for(int j=i+1 ; j<list.size() ; j++){
                if (list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }
    System.out.println(list);
    }
}
