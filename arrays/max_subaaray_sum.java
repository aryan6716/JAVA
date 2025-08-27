package arrays;
public class max_subaaray_sum {
        public static void subarray(int numbers[]){
            int maxsum =Integer.MIN_VALUE;
            for(int i=0 ; i<numbers.length ;i++){
                int sum = 0 ;
                for (int j=i ; j<numbers.length ;j++){
                    sum += numbers[j]; 
                }
                System.out.println(sum);
                    if (sum>maxsum){
                         maxsum=sum;
                    }
            }
          System.out.println("max sum:" + maxsum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10 };
         subarray(numbers);
    }
}
