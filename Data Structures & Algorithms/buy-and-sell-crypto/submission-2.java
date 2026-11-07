class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = prices[0];
        int buyDay = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
                buyDay = i;
            }
        }
        for(int i=buyDay+1;i<prices.length;i++){
            int profit = prices[i] - minPrice;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
