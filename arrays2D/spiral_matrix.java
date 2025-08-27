package arrays2D;

public class spiral_matrix {
    public static void printSpiral(int arr[][]){
        int  n = arr.length;
        // int m =arr[0].length;
        // int start_row = 0;
        // int end_row = n-1;
        // int start_column = 0;
        // int end_column = m-1;
        for(int i=0 ; i<4 ; i++){
             for(int j=1 ;j<n-i ;j++){
                System.out.print(arr[i][j]+" ");

             }
        }
    }
    public static void main(String args[]){
        int arr[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(arr);
    }
}
