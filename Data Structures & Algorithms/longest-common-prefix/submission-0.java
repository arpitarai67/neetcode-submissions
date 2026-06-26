class Solution {
    public String longestCommonPrefix(String[] strs) {
        String compare = strs[0];
        for(int i =0; i<strs.length; i++){
            if(strs[i].length()< compare.length()){
                compare = strs[i];
            }
        }
        int counter = 0;
        while(compare.length()>0 && counter<strs.length){
            if(!strs[counter].startsWith(compare)){
                compare = compare.substring(0, compare.length()-1);
                continue;
            }
            counter++;
        }
        return compare;

    }
}