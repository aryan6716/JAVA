//print the index of the target value

package arrays;

public class ques2 {
    public static int result(int nums[],int target_value){
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target_value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,0,4};
        int target_value = 4 ;
        System.out.print(result(nums,target_value));
    }
}
