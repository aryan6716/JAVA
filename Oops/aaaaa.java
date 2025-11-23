package Oops;

public class aaaaa {

    public static void div(int a,int b){
        if(b==0){
            throw new ArithmeticException("manual exception")
        }else{
            System.out.println("a+b = " + (a+b));
        }
       }
    public static void main(String[] args) {
        div(2, 3);
    }
}
