class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;
        int l = 0;
        int r = length-1;
        int maxWater = 0;

        int water = 0;

        while(l<r){
            water = (Math.min(heights[l], heights[r]))*(r-l);
            maxWater = Math.max(water, maxWater);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxWater;
    }
}
