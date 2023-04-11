package Array;

public class BestTimeToBuyAndSellStockI {
    public static void main(String[] args) {
        int[] x = {7, 2, 5, 6, 13, 1, 6};
        System.out.println(maxProfit(x));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
