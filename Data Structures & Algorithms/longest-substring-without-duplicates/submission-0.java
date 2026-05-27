class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxCount = 0;
        
        int l =0;
        int r = 0;
        while(r<s.length()){
        
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            
            maxCount = Math.max(maxCount, r-l+1);
            r++;
        
        }
        return maxCount;
    }
}
