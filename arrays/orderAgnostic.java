package arrays;

import java.util.Arrays;

public class orderAgnostic {
    public static int binarysearch(int numbers[],int find){
        int start = 0 , end = numbers.length-1;

        //find weather array is ascending or descending
        boolean isAsc = numbers[start] < numbers[end];

        while (start<=end){
            
            int mid = start + (end-start)/2;  

            if (numbers[mid]==find){
                return mid;
            }

            if (isAsc){
                if (numbers[mid]<find){
                start = mid+1;
                }
                else{ 
                end = mid-1;
                }
            }
            else {
                if (numbers[mid]>find){
                start = mid+1;
                }
                else{ 
                end = mid-1;
                 }
            }
        } 
    System.out.print("not found: ");
    return -1;  //if not exist
    }
    public static void main(String args[]){
            // int numbers[] = {1,3,4,5,7,14,15,19};
            int numbers[] = {19,17,15,10,7,4};
            int find = 15;
            System.out.print(binarysearch(numbers,find));
    }
}
