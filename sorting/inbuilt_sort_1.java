package sorting;

import java.util.Arrays;

public class inbuilt_sort_1 {
    public static void printARR(int arr[]){
    for(int i=0 ; i<arr.length ;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String args[]){
        int arr[] = {5,3,4,1,2};
        Arrays.sort(arr);   //sort in increasing order
        printARR(arr);
    }
}
