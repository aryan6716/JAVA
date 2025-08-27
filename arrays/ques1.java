// written true if any element appears at least twice in array and return false if each element is different

package arrays;
public class ques1 {
    public static boolean result(int nums[]){
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
        }
    }
      return false;  
    }
    public static void main(String args[]){
        int nums[] = {2,3,3,1};
       System.out.print(result(nums));  
    }
}
