class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1;i <piles.length;i++){
            if (piles[i]>max){
                max = piles[i];
            }
        }
        int low = 1;
        int high = max;

        while(low<=high){
            int mid = low+(high-low)/2;
            int tot = totalt(piles,mid);
            if (tot>h){
                low = mid+1;
            }
            else if(tot<=h){
                high = mid-1;
            }

        }
        return low;
        
    }

    public int totalt(int[] piles, int k){
        int t = 0;
        for(int i = 0 ; i <piles.length;i++){
            t+= (piles[i]+k-1)/k;
        }
        return t;
    }
}
