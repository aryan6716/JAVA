package arrays2D;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            arr[i][j] = sc.nextInt();
        }

        for(int row[] : arr){
            System.out.println(Arrays.toString(row));
        }
        
    sc.close();
    }
}

