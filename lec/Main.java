package lec;

// public class maths {
//     public static void cartesian(int arr1[] , int arr2[]){
//         System.out.println("\nCartesian product as follows:");
//         for(int i = 0; i<arr1.length ; i++){
//             for(int j = 0; j<arr2.length ; j++){
//                 System.out.print("("+arr1[i]+","+arr2[j]+")");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr1[] = {1,2};
//         int arr2[] = {4,5};
//         cartesian(arr1,arr2);
//     }
// }

class Test {
    Test() {
        System.out.println("Constructor called");
    }
     void Test() {
        System.out.println("Method called");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();  //constructor call
        t.Test(); //method call
    }
}



