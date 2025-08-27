package sorting;
public class insertion_sort {
    public static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length  ; i++){
            int curr = arr[i];
            int previous = i-1;
            //finding correct position to insert
            while (previous>=0 && arr[previous] > curr){
                arr[previous+1] = arr[previous];
                previous--;   //move towards left and check all the elements
            }
            arr[previous+1] = curr;
        }
    }
    public static void printARR(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
        } 
             System.out.println();
    }
            
    public static void main(String[] args){
        int arr[] = {5,4,1,2,3}; 
         insertionSort(arr) ;
         printARR(arr);
    }
}
 