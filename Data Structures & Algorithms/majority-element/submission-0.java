class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        for(int i =1; i<nums.length; i++){
            if(counter>nums.length/2) return nums[i-1];
            if(nums[i]==nums[i-1]){
                counter++;

            }else{
                counter =1;
            }
        }
        return counter>=nums.length/2 ? nums[nums.length-1] : -1;
    }
}