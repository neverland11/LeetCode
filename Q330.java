import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;

/**
 * Created by Ge on 2016/7/4.
 * 330. Patching Array
 * Given a sorted positive integer array nums and an integer n,
 * add/patch elements to the array such that any number in range [1, n] inclusive can be formed by the sum of some elements in the array.
 * Return the minimum number of patches required.
 *
 * Greedy
 * 解法：
 * miss表示已完成[0,miss]的集合。
 * 当nums[i] <= miss时，可以表示0到nums[i]+miss的集合。
 * 反之，则添加miss，可以表示0到miss*2的集合。
 * miss>n后，则完成。
 */


public class Q330 {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int count = 0;
        int i = 0;
        while(miss <= n){
            if(i < nums.length && nums[i] <= miss){
                miss = miss + nums[i++];
            } else {
                miss = miss * 2;
                count = count + 1;
            }
        }
        return count;
    }
}