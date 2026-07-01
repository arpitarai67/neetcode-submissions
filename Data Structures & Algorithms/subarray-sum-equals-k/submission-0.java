class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum =0, counter =0;
        for(int i =0; i<nums.length; i++){
            
            sum+=nums[i];
            if(sum == k) counter++;
            if(map.containsKey(sum-k)) counter+=map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return counter;
    }
}