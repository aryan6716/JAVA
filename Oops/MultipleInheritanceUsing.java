
package Oops;

public class MultipleInheritanceUsing  {
    public static void main(String[] args) {
        son s = new son();
        s.show();
        s.display();
    }
}

interface father {
    void show();  // abstract method
}

interface mother {
    void display();  // abstract method
}

class son implements father, mother {
    @Override
    public void show() {
        System.out.println("Father’s property: discipline and strength");
    }

    @Override
    public void display() {
        System.out.println("Mother’s property: love and care");
    }
}

