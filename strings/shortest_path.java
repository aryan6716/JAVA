package strings;
 
import java.util.*;
public class shortest_path {
    public static double shortestPath(String a){    //bcz math gives op in double
        int x=0 , y=0 ;  // x(x-axis)   y(y-axis)
        for(int i=0 ; i<a.length() ; i++){
            char direction = a.charAt(i);
                if (direction == 'N'){
                       x++;
                }
                else if (direction == 'S'){
                    x--;
                }
                else if (direction == 'E'){
                   y++;
                }
                 else if (direction == 'W'){
                   y--;
                }
        }
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));   

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        System.out.printf("%.2f",shortestPath(a));

    }
}
