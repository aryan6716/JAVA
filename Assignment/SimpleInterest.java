package Assignment;

public class SimpleInterest {
    public static int calculateInterest(int principal,int rate,int time){
        return (principal * rate * time)/100;
    }
    public static void main(String[] args) {
        System.out.println(calculateInterest(1000,5,2));
    }
}
