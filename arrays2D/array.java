package arrays2D;

import java.util.*;

public class array {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("no of rows: ");
        int n = sc.nextInt();
        System.out.print("no of columns: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        //input
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
        //output
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                System.out.print(arr[i][j]+" ");
            }
       System.out.println();
        }
   }
}
