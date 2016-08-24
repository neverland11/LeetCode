/**
 * Created by Ge on 2016/7/7
 * 答案正确，但会TLE.
 */
public class Q62_new {
    public int uniquePaths(int m, int n) {
        int res = count(m - 1, n - 1);
        return res;
    }

    public int count(int m ,int n){
        if(m == 0){
            return 1;
        } else if(n == 0){
            return 1;
        } else {
            return count(m - 1, n) + count(m, n - 1);
        }
    }
}
