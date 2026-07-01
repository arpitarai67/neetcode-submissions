class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        int counter = 1;
        for(int i =1; i<nums.length; i++){
            if(nums[i]==nums[i-1]) counter++;
            
            else{ 
                if(counter>n/3) list.add(nums[i-1]);               
                counter=1;
            }

        }
        if(counter>n/3) list.add(nums[n-1]);
        return list;
    }
}