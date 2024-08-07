/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 

Constraints:

1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104
*/
package array;

public class best_time_to_buy_and_sell2 {

    public static void main(String[] args) {
        int[] num={5,2,6,1,4,7,3,6};
        System.out.print(time(num));
    }
    public static int time(int[] num){
        int profit=0;
        for(int i=1;i<num.length;i++){
           
            if(num[i]>num[i-1])
            profit+=num[i]-num[i-1];
        }
        return profit;
    }
}
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//https://youtu.be/Q7v239y-Tik?si=QDE_sHIjqkhIyj-a

