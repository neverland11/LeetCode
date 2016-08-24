import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ge on 2016/7/4.
 * 229. Majority Element II
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 */
public class Q229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }
        if(nums.length == 1){
            res.add(nums[0]);
            return res;
        }
        int n1 = nums[0];
        int n2 = 0;
        int c1 = 1; //times that n1 appears
        int c2 = 0; //times that n2 appears

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == n1){
                 c1++;
            }else if(nums[i] == n2){
                c2++;
            } else if(c1 == 0){
                n1 = nums[i];
                c1 = 1;
            } else if(c2 == 0){
                n2 = nums[i];
                c2 = 1;
            } else {
                c1--;//c1 bigger, the times bigger. if else appears, means c1 should be smaller(as others bigger)
                c2--;
            }
        }

        c1 = 0; c2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(n1 == nums[i]){
                c1++;
            }else if(n2 == nums[i]){
                c2++;
            }
        }

        if(c1 > nums.length/3){
            res.add(n1);
        }
        if(c2 > nums.length/3){
            res.add(n2);
        }

        return  res;
    }


    public static void main(String[] args) {
        Q229 que = new Q229();
        int[]num = {2,2,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9};
        que.majorityElement(num);
    }
}
