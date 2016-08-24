/**
 * Created by Ge on 2016/7/1.
 * 70. Climbing Stairs
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

/**
    n <= 1时，只有一种。

　　n > 1时，对于每一个台阶n, 最后一步都有两种方法: 1.从i-1迈一步 2.从i-2迈两步。

　　所以，到达台阶i的方法数 = 到达台阶i-1的方法数 + 到达台阶i-2的方法数。
    Easy DP。
    Leetcode上用递归会栈溢出。
 **/
public class Q70 {
    public int climbStairs(int n) {
        if(n <= 2){ //step = 1, then 1, step = 2, then 2
            return n;
        }
        int now = 3; //begin with 3;
        int step = 0;
        int s1 = 1; //step = 1, return 1;（n - 2）
        int s2 = 2; //step = 2 return 2; （n - 1）

        while(now <= n){
            step = s1 + s2;
            s1 = s2; //n - 2 = n - 1, 即往上一层
            s2 = step; //s2 是now层step数（往上一层）
            now++;
        }
        return step;
    }
}
