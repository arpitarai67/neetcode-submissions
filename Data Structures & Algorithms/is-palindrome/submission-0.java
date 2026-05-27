class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toUpperCase();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if(!Character.isLetter(ch1) && !Character.isDigit(ch1)){
                start++;
                continue;
            }
            else if(!Character.isLetter(ch2) && !Character.isDigit(ch2)){
                end--;
                continue;
            }else{
                if(ch1 != ch2) return false;
                start++; 
                end--;
            }
            

        }
        return true;
    }
}
