class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        

        for(int i =1; i< nums.length; i++){
            int pick = nums[i] + (i >=2? dp[i-2] : 0);
            int notPick = dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[nums.length-1];
    }
}
