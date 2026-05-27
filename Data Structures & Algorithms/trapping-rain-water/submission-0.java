class Solution {
    public int trap(int[] height) {
        int res = 0;
        int lmax = height[0];
        int rmax = height[height.length-1];
        int l = 0;
        int r = height.length-1;
        while(l<r){
            if(height[l]< height[r]){
                lmax = Math.max(lmax, height[l]);
                res += lmax - height[l];
                l++;
            }else{
                rmax = Math.max(rmax, height[r]);
                res += rmax - height[r];
                r--;
            }
        }

        return res;
    }
}
