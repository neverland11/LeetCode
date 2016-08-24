/**
 * Created by Ge on 2016/7/1.
 * 338. Counting Bits
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num
 * calculate the number of 1's in their binary representation and return them as an array.
 */

/**
 * 解法一：
 * 位运算。n*2 = 左移一位，1的个数不变。因此，通过 n >> 1计算 n/2中1的个数（递归思想）
 * 最后一位如有1，则通过（i & 1)来确定（有为1， 无为0）
 *
 * 解法二：
 * [0] -> [1], [0,1] -> [1,2], [0,1,1,2] -> [1,2,2,3] ....
 * 每次length翻倍，num[i] = num[i - length] + 1
 * 以此类推
 */
public class Q338 {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        for(int i = 1;i <= num; i++){
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Q338 que = new Q338();
        System.out.println(que.countBits(32));
    }
}

