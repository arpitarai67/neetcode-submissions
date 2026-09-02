class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        String res = "";
        for(int i =0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                if(isPalindrome(s.substring(i, j+1) ) && (j-i+1) > len){
                    len = j-i+1;
                    res = s.substring(i, j+1);
                    
                }
            }
        }

        return res;

        
    }
    private boolean isPalindrome(String str){
        int s =0;
        int e = str.length()-1;
        while(s<=e){
            if(str.charAt(s)!= str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
