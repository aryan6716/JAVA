package Recursion;

public class checkSorted {
    public static boolean check(int arr[],int i){
        if (i == arr.length-1){
            return true;    //When you reach the last element, there’s no next element to compare
        }
        if (arr[i+1]-arr[i]!=1){
            return false;
        }
          return check(arr,i+1);

          //or  
          // return (i == arr.length - 1) || (arr[i + 1] - arr[i] == 1 && check(arr, i + 1))

      }
    public static void main(String args[]){
        int arr[] = {1,2,3,5,4};
        System.out.println(check(arr,0));
  }
}
