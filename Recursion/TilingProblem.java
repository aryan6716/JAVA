/*
Given a "2 x n" board and tiles of size "2 x 1", the task is to count the number of ways to tile
the given board using the 2 x 1 tiles.A tile can either be placed horizontally i.e., as a 1 x 2 
tile or vertically i.e., as 2 x 1 tile. 
 */

package Recursion;

public class TilingProblem {
    public static int tiling(int n){  //floor size = 2*n
        if (n==1 || n==0) {return 1;}   // base case
      return tiling(n-1) + tiling(n-2);   // vertical + horizantal
    }
    public static void main(String args[]){
        int n = 3;
        System.out.print(tiling(n));
    }
}
