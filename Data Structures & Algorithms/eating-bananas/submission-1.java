class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 0 ; i <piles.length;i++){
            if (piles[i]>max){
                max = piles[i];
            }
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int k = total(piles,mid);
            if (k>h){
                low=mid+1;
            }
            else if (k<=h){
                ans = mid;
                high = mid-1;
                

            }
        }
        return ans;
        
    }
    public int total(int[] piles, int k){
        int totaltime = 0;
        for (int i = 0; i <piles.length;i++){
            totaltime += (piles[i]+k-1)/k;

        }
        return totaltime;



    
        
    }
}
