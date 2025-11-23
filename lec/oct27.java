// create a interface greeting a default methods "say hello" implement a class english greeting spanish greeting amd call the default method

// create a interface calculator with
// 1. default method(add)
// 2. static method(multiply)

// crete two interfaces defining the same default methods and a class implement the both interfaces write code to demonstrate how to handle this scenario


package lec;
public class object{

interface Calculator {
    default int add(int a, int b) {
         return a + b;
         }
    static int multiply(int a, int b) { 
        return a * b; 
    }
}

class SimpleCalculator implements Calculator {}

public class Main2 {
    public static void main(String[] args) {
        SimpleCalculator c = new SimpleCalculator();
        System.out.println(c.add(10, 5));
        System.out.println(Calculator.multiply(10, 5));
    }
 }
}
