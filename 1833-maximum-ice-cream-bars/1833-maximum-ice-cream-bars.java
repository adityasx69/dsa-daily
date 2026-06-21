class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int total = 0;
        int x = 0;
        while(coins>0 && x<costs.length){
            if(costs[x]<=coins){
                total++;
                coins = coins-costs[x];
            }
            else{
                break;
            }
            x++;
        }
        return total;
    }
}