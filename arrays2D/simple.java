import java.util.Arrays;
import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of rows: ");
        int n = sc.nextInt();
        System.out.print("No of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println(Arrays.deepToString(arr));
    }
}

