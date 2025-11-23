package arrays;

import java.util.Arrays;

public class binary_search {
    public static int binarysearch(int numbers[],int find){
        int start = 0 , end = numbers.length-1;
        while (start<=end){
            // int mid = (start + end)/2;  //whenever the operation (start + end ) exceeds the int range it will give an error
            
            int mid = start + (end-start)/2;  

            if (numbers[mid]==find){
                return mid;
            }
            else if (numbers[mid]<find){
                start=mid+1;
            }
            else{ 
                end = mid-1;
            }
        } 
    System.out.print("not found: ");
    return -1;  //if not exist
    }
    public static void main(String args[]){
            int numbers[] = {1,2,3,4,5};
            int find = 5  ;
            System.out.print(binarysearch(numbers,find));
    }
}
