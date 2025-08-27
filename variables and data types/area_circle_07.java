import java.util.*;
public class area_circle_07 {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     float r = sc.nextFloat();
     float area = 3.14f * r * r;    //  or    (float)(Math.PI * r * r)
     System.out.print(area);
sc.close();
    }
}