import java.util.*;    //package

public class input_from_user_05 {
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);     // new class

    String a = sc.next();      //input until space (string i/p)     aryan chauhan
    System.out.println(a);     // aryan


    String b = sc.nextLine();     //whole input (string i/p)  aryan  chauhan
    System.out.println(b);          // aryan chauhan


    int c = sc.nextInt();      //input  (integer i/p)
    System.out.println(c);
    

    float d = sc.nextFloat();      //input (float i/p)
    System.out.println(d);
    
sc.close();

   //simalar for double(nextDouble)  , boolean(nextBoolean)  etc
   }
}
