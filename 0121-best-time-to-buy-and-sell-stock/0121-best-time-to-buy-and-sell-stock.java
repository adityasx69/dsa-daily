class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}

// my approach 
        // int diff = 0;
        // int profit = 0;

        // for(int i=0;i<prices.length;i++){
        //     for(int j=i;j<prices.length;j++){
        //         diff = prices[j] - prices[i];
        //     }
        //     if(diff < 0){
        //         diff = 0;
        //     }
        //     if(diff > profit){
        //         profit = diff;
        //         diff = 0;
        //     }
        // }
        // return profit;