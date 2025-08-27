package arrays;
public class smallest {
    public static int smallest_num(int num[]){
        int min = Integer.MAX_VALUE;   //or max = num[0]
        for (int i=0 ; i<num.length ;i++){
            if (num[i] < min){
                min = num[i];
            }     
        }
        return min;
    }
    public static void main(String args[]){
        int num[] = {1,2,-3,8,5};
        smallest_num(num);
        System.out.print(smallest_num(num));
    }
}
