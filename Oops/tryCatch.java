package Oops;

public class tryCatch {
    public static void main(String[] args) {

        // try {
        // int a = 10, b = 0;
        // int result = a / b; // This line will throw ArithmeticException
        // System.out.println("Result: " + result);
        // }
        // catch (ArithmeticException e) {
        // System.out.println("Error: Division by zero is not allowed!");
        // }
        // System.out.println("Program continues...");

        try {
            int arr[] = { 1, 2, 3 };
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }

    }
}
/*
 * try {
 * // Code that may cause an exception
 * The try block contains risky code that might throw an exception
 * }
 * 
 * catch (ExceptionType e) {
 * To handle the exception throw by try block and prevent program termination.
 * when no exception in try block then skipped, and normal flow continues.
 * multiple Used when you want to handle different exceptions differently
 * the first matching catch runs
 * }
 * The program doesn’t crash — instead, it handles the error and continues.
 * 
 */