package Functions;

public class passByValue {
    public static void call(int a){
        a = 10; 
        System.out.println(a+" first output"); //10
    }
    public static void main(String[] args) {
    int a = 5;
    call(a);
    System.out.println(a+" second output"); //5  pass by value
}    
}
