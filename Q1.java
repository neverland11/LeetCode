/**
 * Created by Ge on 2016/11/7.
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[]res = new int[2];
        for(int i = 0; i < n; i++){
            int first = nums[i];
            for(int j = i + 1; j < n; j++){
                if(first + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
