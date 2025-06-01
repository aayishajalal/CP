class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //create a dp[n][2] 
        int dp[][] = new int[n][2];
        //intialize to -1
        for(int i=0; i<n; i++){
            //sets both elements to -1
            Arrays.fill(dp[i],-1);
        }
        return new Solution().maxProfitUtil(prices, 0, 0, n, dp);
    }
    public int maxProfitUtil(int[] prices, int ind, int buy, int n, int[][] dp ){
        //base case
        if(ind==n) return 0;
        //check if computed already
        if(dp[ind][buy] != -1 ) return dp[ind][buy];
        int profit;
        //decision to buy/ntg or sell/ntg
        if(buy == 0){
            profit= Math.max((0+maxProfitUtil(prices, ind+1, 0, n, dp)),
            (-prices[ind]+maxProfitUtil(prices, ind+1, 1, n, dp)));
        }
        else{
            profit=Math.max((0+maxProfitUtil(prices, ind+1, 1, n, dp)),
            (prices[ind]+maxProfitUtil(prices, ind+1, 0, n, dp)));
        }

        //if not computed already - assign result
        dp[ind][buy] = profit;

        return profit;
    }
}