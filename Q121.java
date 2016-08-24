/**
 * Created by Ge on 2016/7/1.
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */


/**
 * 第i个数字 - 前面i-1个数字中最小的那个就是i上能得到的最大获益值。再和max比较即可。
 */
public class Q121 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }

        int max = 0;
        int min = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] - min > 0) { //i天能得到的最大收益
                if(max < prices[i] - min) {
                    max = prices[i] - min;
                }
            } else {
                min = prices[i]; //如果price[i]小于min，则对后面的i来说，price[i]为最小值。
            }
        }
        return max;
    }
}
