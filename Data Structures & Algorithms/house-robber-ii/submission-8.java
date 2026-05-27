class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         if (n == 1) return nums[0];
        return Math.max(robHelper(Arrays.copyOfRange(nums,0,n-1 )), robHelper(Arrays.copyOfRange(nums,1, n) ));
    }

    private int robHelper(int[] nums){
        
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        for(int i =1 ; i<nums.length; i++){
            int pick = nums[i] + (i>=2 ? dp[i-2] : 0);
            int notpick = dp[i-1];
            dp[i] = Math.max(pick, notpick); 
        }

        return dp[dp.length-1];
    }
}
