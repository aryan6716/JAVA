package sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort_4 {
    public static void printARR(Integer arr[]){
    for(int i=0 ; i<arr.length ;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String args[]){
        Integer arr[] = {5,3,4,1,2};  //object of integer class
        Arrays.sort(arr,0,3,Collections.reverseOrder());  //sort in decreasing order
        printARR(arr);
    }
}
