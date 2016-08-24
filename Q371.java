/**
 * Created by Ge on 2016/7/5.
 * 位运算。
 */
public class Q371 {
    public int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }

    public static void main(String[] args) {
        Q371 que = new Q371();
        que.getSum(7, 8);
    }
}
