class Solution {
    public int maxProfit(int[] prices) {
        int maxp= 0;
        int buy = prices[0];
        for(int i = 1; i <prices.length;i++){
            int sell =0;
            if(prices[i]<buy){{
                buy = prices[i];
            }
            }
            else{
                sell = prices[i];
                maxp = Math.max(maxp,sell-buy);
            }
        }
        return maxp;

        




        
    }
}
