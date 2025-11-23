package Functions;

public class basicFunction {
  public static void main(String[] args) {
    int a = 10;
    {
        int b=4;
    }
    System.out.println(b);
  }  
}


/*
🔹 1. What is Scope in Java?
Scope determines where a variable or method is accessible in your program.
In Java, variables and methods have different types of scope.

🔹 2. Types of Scope in Java

A. Local Scope (Inside a Method)

Variables declared inside a method are called local variables.
Accessible only within that method.
Not visible outside.

public class Test {
    public static void main(String[] args) {
        int x = 10; // local variable
        System.out.println(x); // ✅ works
    }
    
    public static void anotherMethod() {
        // System.out.println(x); // ❌ ERROR: x not visible here
    }
}

Key point:
Local variables cannot be used outside the method they are declared in.


B. Instance Scope (Non-static, Class-level)

Variables declared inside a class but outside methods are called instance variables.

Each object has its own copy.

Accessible in all non-static methods of that object.

public class Test {
    int y = 20; // instance variable

    public void showY() {
        System.out.println(y); // ✅ works
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.y); // ✅ works
    }
}

Error Example:

public static void main(String[] args) {
    System.out.println(y); // ❌ ERROR: cannot access non-static variable y from static context
}

Why?
main is static, but y is instance-level → need an object reference (t.y) to access it.


C. Static/Class Scope

Variables declared static inside a class → shared by all objects.
Accessible anywhere via class name or directly in static methods.

public class Test {
    static int z = 30;

    public static void showZ() {
        System.out.println(z); // ✅ works
    }

    public static void main(String[] args) {
        System.out.println(Test.z); // ✅ works
        showZ(); // ✅ works
    }
}

Error Example:
public void nonStaticMethod() {
    System.out.println(z); // ✅ works (instance method can access static)
}

public static void main(String[] args) {
    // System.out.println(nonStaticMethod()); // ❌ ERROR: cannot call non-static method from static context directly
}


D. Block Scope

Variables declared inside { } (like loops, if blocks) are visible only inside that block.

public class Test {
    public static void main(String[] args) {
        if (true) {
            int a = 50; // block scope
            System.out.println(a); // ✅ works
        }
        // System.out.println(a); // ❌ ERROR: a not visible here
    }
}
🔹 Key Points
Blocks {} can access variables declared outside them.

If you declare a new variable with the same name inside the block, it shadows the outer variable.

🔹 3. Summary Table
Scope	Declared Where	Accessible Where	Error Example
Local	Inside method	Only inside that method	Access outside method → ERROR
Instance	Inside class, outside methods	Non-static methods and objects	Static context → ERROR
Static/Class	Inside class, static keyword	Anywhere via class or static method	Static cannot access non-static directly
Block	Inside {}	Only inside that block	Outside block → ERROR
🔹 Key Rules

Local variables must be initialized before use.
Instance variables can be accessed via object.
Static variables can be accessed via class name.
Block variables exist only within the block. 
*/


/*
🔹 What is Shadowing?

Shadowing happens when a local variable (inside a method) has the same name as an instance variable (class-level variable).
The local variable “shadows” the instance variable inside the method.
Outside the method, the instance variable is still accessible.

🔹 Simple Example
class ShadowDemo {
    int x = 10; // instance variable

    void show() {
        int x = 20; // local variable shadows instance variable
        System.out.println("Local x: " + x);       // 20
        System.out.println("Instance x: " + this.x); // 10
    }

    public static void main(String[] args) {
        ShadowDemo obj = new ShadowDemo();
        obj.show();
    }
} 

🔹 Explanation

int x = 20; inside show() shadows the instance variable x = 10.
Inside show(), if you just write x, it refers to the local variable.
To access the original instance variable, use this.x.

Key Points

Shadowing only occurs when a variable with the same name exists in an inner scope.
Local variables always take precedence over instance variables within that method.
Shadowing does not delete or change the outer variable; it’s still accessible with this (for instance) or outer reference.
*/