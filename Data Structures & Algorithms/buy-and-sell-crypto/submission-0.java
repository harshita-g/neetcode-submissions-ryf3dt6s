class Solution {
    public int maxProfit(int[] prices) {
        // int min_price=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            // max_price=0;
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int sell=prices[j];
                int profit=sell-buy;
                maxprofit=Math.max(profit,maxprofit);

            }
        }
        return maxprofit;
        
    }
}
