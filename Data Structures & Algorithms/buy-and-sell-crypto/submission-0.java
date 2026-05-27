class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;
       for(int i : prices){
        if(i < minPrice) minPrice = i;
        else{
            int profit = i - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
       }

       return maxProfit;
    }
}
