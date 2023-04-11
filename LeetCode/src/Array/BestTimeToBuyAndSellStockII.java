package Array;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] x = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(x));
    }

    //chua check - hinh nhu dang sai
    public static int maxProfit(int[] prices) {
        int profit = 0,buy = 0, sell = 0;
        //7,1,5,3,6,4
        for (int j = 1; j < prices.length - 1; j++) {
            if (prices[j] - prices[j-1] > 0) {
                profit += prices[j] - prices[sell];
                sell = j;
            }else{
                sell++;
            }
        }
        return profit;
    }
}
