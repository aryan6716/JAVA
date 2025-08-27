package arrays;
public class largest {
    public static int largest_num(int num[]){
        int max = Integer.MIN_VALUE;   //or max = num[0]
        for (int i=0 ; i<num.length ;i++){
            if (num[i] > max){
                max = num[i];
            }     
        }
        return max;
    }
    public static void main(String args[]){
        int num[] = {1,2,7,8,5};
        largest_num(num);
        System.out.print(largest_num(num));
    }
}
