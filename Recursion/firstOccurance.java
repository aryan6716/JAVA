package Recursion;

public class firstOccurance {
    public static int index(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return index(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,3,4,5};
        int key = 2;
        System.out.print(index(arr,0,key));
    }
}
