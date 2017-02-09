/**
 * Created by Ge on 2016/11/7.
 * 167. Two Sum II - Input array is sorted
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 */
public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[]res = new int[2];
        for(int i = 0; i < n; i++){
            int first = numbers[i];
            for(int j = i + 1; j < n; j++){
                if(first + numbers[j] == target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                } else if(first + numbers[j] > target){
                    break;
                }
            }
        }
        return res;
    }
}
