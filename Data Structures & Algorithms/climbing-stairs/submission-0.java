class Solution {
    int[] t = new int[31];
    public int climbStairs(int n) {
        
        for(int i=0;i<t.length;i++){
            t[i]=-1;
        }
        if(n==0 || n==1){
            return 1;
        }
        if(t[n]!=-1){
            return t[n];
        }
        t[n]=climbStairs(n-1)+climbStairs(n-2);

        return t[n];

        
    }
}
