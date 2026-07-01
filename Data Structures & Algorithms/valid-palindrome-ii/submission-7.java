class Solution {
    private boolean isPalindrome(String str){
        int s = 0, e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))return false;
            s++;
            e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s.substring(left+1, right+1)) || isPalindrome(s.substring(left, right));
            }
            left++;
            right--;
        }
        return true;
    }
}