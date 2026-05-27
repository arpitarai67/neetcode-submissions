class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(key, l);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String , List<String>> e : map.entrySet()){
            res.add(e.getValue());
        }

        return res;
    }
}
