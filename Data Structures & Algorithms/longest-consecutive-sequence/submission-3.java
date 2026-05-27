class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i : nums) set.add(i);
       List<Integer> start = new ArrayList<>();
       for(int i : nums){
        if(!set.contains(i-1)){
            start.add(i);
        }
       }

       int max = 0;
       
       for(int i =0; i< start.size(); i++){
        int count = 1;
        int currMax = 1;
        while(set.contains(start.get(i)+count)){
            count++;
            currMax++;
        }
        max =Math.max(max, currMax);
       } 

       return max;
    }
}
