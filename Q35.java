/**
 * Created by Ge on 2016/6/27.
 * 35. Search Insert Position
 */
public class Q35 {
    public int searchInsert(int[] nums, int target) {
        //first or last
        if (target < nums[0]){
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        //binary search
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid;
            } else { //equals
                return mid;
            }
            /*if (end - start == 1){
                break;
            }*/
        }
        return start;
    }

    public static void main(String[] args) {
        Q35 temp = new Q35();
        int[] nums = {1};
        int target = 1;
        int result =  temp.searchInsert(nums,target);
        System.out.println(result);
    }
}
