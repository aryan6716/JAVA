package lec;

public class abc3 {
    void sum(){ //non-static or instance method
    System.out.println("hello");
    }

    static void mul(){ //static method
    System.out.println("hello gla");
    }
    public static void main(String[] a) {

        abc3 g = new abc3();
        g.sum();
        
        mul();
    }
}

