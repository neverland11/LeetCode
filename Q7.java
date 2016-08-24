/**
 * Created by Ge on 2016/7/4.
 * 7. Reverse Integer
 * Reverse digits of an integer.
 * 符号，0， overflow
 *
 * 解法： long result=0;
 * while(x!=0){
 *      result=result*10+x%10;
 *      if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)
 *          return 0;
 *          x = x / 10;
 *      }
 * return (int)result;
 */
public class Q7 {
    public int reverse(int x) {
        int flag = 0; //正负数
        if(x < 0){
            if(x == Integer.MIN_VALUE)
                return 0;
            flag = 1;
        }

        int level = 1;
        x = Math.abs(x);
        int use = x;
        while(x / 10 > 0){
            x  = x / 10;
            level = level * 10;
        }
        int res = 0;
        x = use;
        int zero = 0;
        while(level >= 1 || x > 1){
            int temp = x % 10;
            if(temp != 0 || zero == 1){
                zero = 1;
                if((long)res + (long)temp * level > Integer.MAX_VALUE){
                    return 0;
                }
                res = res + temp * level;
            }
            level = level / 10;
            x = x / 10;
        }

        if(flag == 0) {
            return res;
        } else {
            return res * -1;
        }



    }

    public static void main(String[] args) {
        Q7 que = new Q7();
        que.reverse(2147483647);
    }
}
