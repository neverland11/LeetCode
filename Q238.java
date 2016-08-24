/**
 * Created by Ge on 2016/7/4.
 * 238. Product of Array Except Self
 *
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 *
 * 解法：两个辅助arrays, left和right, 记录左边到i(included)和右边到i的product，再进行计算。
 */
public class Q238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = nums[0];
        for(int i = 1; i < length; i++){
            left[i] = left[i - 1] * nums[i];
        }
        right[length - 1] = nums[length - 1];
        for(int i = length - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i];
        }

        res[0] = right[1];
        res[length - 1] = left[length - 2];

        for (int i = 1; i < length - 1; i++){
            res[i] = left[i - 1] * right[i + 1];
        }
        return res;

    }
}
