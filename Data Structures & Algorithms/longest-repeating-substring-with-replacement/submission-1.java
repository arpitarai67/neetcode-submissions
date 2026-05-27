class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l =0;
        int r = 0;
        int maxi = 0;
        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            int max = Collections.max(new ArrayList<>(map.values()));
            while((r-l+1) - max > k){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            maxi = Math.max(r-l+1, maxi);

            r++;
        }

        return maxi;
    }
}
