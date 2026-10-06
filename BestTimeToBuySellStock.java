public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate current profit
            int currentProfit = prices[i] - minPrice;

            // Update maximum profit
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);

        System.out.println("Maximum Profit = " + answer);
    }
}