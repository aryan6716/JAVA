package arrays;

import java.util.Arrays;

public class Ceiling {
    public static int binarysearchCeiling(int numbers[], int find) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (numbers[mid] == find) {
                return mid;
            } else if (numbers[mid] < find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;  
    }

    public static void main(String args[]) {
        int numbers[] = { 2,3,5,9,14,16,18};
        int find = 15;
        System.out.print("ceiling index:" +  binarysearchCeiling(numbers, find));
    }
}
