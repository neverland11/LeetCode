/**
 * Created by Ge on 2016/7/12.
 * 27. Remove Element
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Q27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int flag = 0;
        int end = nums.length - 1;
        for(int i = 0; i < end; i++){
            if(nums[i] == val){
                flag = 1;
                while(nums[end] == val && end > i){
                    end--;
                }
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
            }
        }

        if(flag == 0){

            return nums.length;
        } else {
            return end;
        }
    }
}
