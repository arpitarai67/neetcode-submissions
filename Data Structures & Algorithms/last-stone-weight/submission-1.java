class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n==1) return stones[0];
        for(int i =0; i<n-1; i++){   
            Arrays.sort(stones);
            int max = stones[n-1];
            int secMax = stones[n-2];
            stones[n-1] = max-secMax;
            stones[n-2] = 0;
        }
        Arrays.sort(stones);
        return stones[n-1];

        
    }
}
