import java.util.ArrayList;

/**
 * Created by Ge on 2016/11/29.
 * 239. Sliding Window Maximum
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 */
public class Q239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length <= 1){
            return nums;
        }

        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++){
            int max = nums[i];
            for(int j = i; j < i + k; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}
