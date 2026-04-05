class Solution {
    public int maxProfit(int[] prices) {
        //need to keep track of the lowest price we have seen so far, and check that if you sold today what is the profit that you will make
        int n = prices.length;
        int max_profit=0;
        //lets say by default we are taking the first element as the minimum
        int diff = prices[0];

        for(int i=1;i<n;i++){
            max_profit = Math.max(max_profit, prices[i]-diff);
            diff = Math.min(diff, prices[i]);
        }
        return max_profit;
        
    }
}
