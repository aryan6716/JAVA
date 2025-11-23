package JavaClasswork;

public class polymorphism {
 public void calculate(int a,int b){
    int c = a*b;
    System.out.println(c);
 }   
public void calculate (double a,double b){
    double c=a+b;
    System.out.println(c);
}
public class math{
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        // obj.calculate(5, 4);
        // obj.calculate(5.0, 4.0);
        obj.calculate(5, 4.0);
    }
}
}