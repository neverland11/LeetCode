import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ge on 2016/7/12.
 * 202. Happy Number
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 */
public class Q202 {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> have = new HashMap<>();
        while(true) {
            int use = digitsquare(n);
            if (use == 1) {
                return true;
            } else if(have.containsKey(use)) {
                return false;
            } else {
                have.put(use, true);
            }
            n = use;
        }

    }

    public int digitsquare(int n){
        int res = 0;
        while(n >= 1){
            int temp = n % 10;
            res = res + temp * temp;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Q202 que = new Q202();
        que.isHappy(19);
    }
}
