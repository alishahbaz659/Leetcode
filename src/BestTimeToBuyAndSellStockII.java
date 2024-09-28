public class BestTimeToBuyAndSellStockII {


    //O(n) valley peek approach
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += (prices[i] - prices[i - 1]);
            }
        }

        return totalProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max total profit: " + maxProfit(prices));


    }
}
