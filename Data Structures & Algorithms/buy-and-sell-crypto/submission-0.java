class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int buyPrice = prices[i];
                if(buyPrice < prices[j]){
                   int profit = prices[j] - buyPrice;
                   maxprofit = Math.max(profit,maxprofit); 
                }
            }
        }
        return maxprofit;
    }
}
