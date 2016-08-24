/**
 * Created by Ge on 2016/6/28.
 * 26. Remove Duplicates from Sorted Array
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int length = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[length] = nums[i+1];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Q26 pro = new Q26();
        int[]nums = {1, 1, 2};
        System.out.println(pro.removeDuplicates(nums));
        System.out.println(nums.toString());
    }
}
