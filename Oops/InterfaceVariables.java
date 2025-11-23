package Oops;

public class InterfaceVariables {
    public static void main(String[] args) {
        buyer c = new seller();
        c.purchase();
        System.out.println(buyer.rice); // 5 proves that variable is static bcz called without making ibj
    }
}

interface buyer {
    int rice = 5; // by default: public + static + final

    void purchase(); // public + abstract (method is public so that can be used outside
                     // interface)(abstract bcz no body)
}

class seller implements buyer {
    @Override
    public void purchase() {
        // rice = 7; error cants assign again to final
        System.out.println("raj needs " + rice + " kg rice");
    }
}

/*
 * ➡️ In Java, all variables declared in an interface are public, static, and
 * final — even if you don’t write it explicitly.
 * So: int rice = 5; -----> public static final int rice = 5;
 * 
 * How can you prove that the variable is static?
 * System.out.println(buyer.rice); ---> 5
 * This shows it belongs to the interface itself, not to any object.
 * 
 * Why can’t we assign a new value to rice inside the class?
 * ❌ Compiler Error: cannot assign a value to final variable rice
 */