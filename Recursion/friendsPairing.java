package Recursion;

public class friendsPairing {
    public static int ways(int n) {
        if (n==1 || n==2){
            return n;
        }
        int single = ways(n-1);
        int pair = (ways(n-1) * ways(n-2));
        return single + pair;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(ways(n));
    }
}
