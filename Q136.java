/**
 * Created by Ge on 2016/7/5.
 * 136. Single Number
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * 解法：^（异或）
 * a ^ 0 = a
 * a ^a = 0
 * a ^ b ^ c = a ^c ^ b
 */
public class Q136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0; i < nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }
}
