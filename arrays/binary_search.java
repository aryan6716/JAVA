package arrays;
public class binary_search {
    public static int binarysearch(int numbers[],int find){
        int start = 0 , end = numbers.length-1;
        while (start<=end){
             int mid = (start + end)/2;
            if (numbers[mid]==find){
                return mid;
            }
            if (numbers[mid]<find){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        } 
    System.out.print("not found");
    return -1;
    }
    public static void main(String args[]){
            int numbers[] = {1,2,3,4,5};
            int find = 4 ;
            System.out.print(binarysearch(numbers,find));
    }
}
