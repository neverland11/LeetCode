/**
 * Created by Ge on 2016/7/12.
 * 258. Add Digits
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * digit root
 *
 */
public class Q258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
