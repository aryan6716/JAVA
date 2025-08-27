package sorting;
public class selection_sort {
    public static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int min_index = i;
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;


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
         selectionSort(arr) ;
         printARR(arr);
    }
}

