public class BestTimeToBuyAndSellStock {


    //brute force O(N^2)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate the profit if sold today
            }
        }
        return maxProfit;
    }

    // O(N)
    //instead of using two loops, keep track of the lowest price, once found then after that sell it
    public static int maxProfitFun(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; //track the lowest price so far
            } else {
                maxProfit = Math.max(price - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit with the inputted prices are using brute force: " + maxProfit(prices));
        System.out.println("Maximum profit with the inputted prices are: " + maxProfitFun(prices));
    }
}
