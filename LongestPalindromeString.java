public class Solution {
    public String longestPalindrome(String s) {
        int longestPalindromeLength = 0;
        String longestPalin = "";
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = i+1; j < s.length() + 1; j++) {
                String subStr = s.substring(i,j);
                if (isPalindrome(subStr)) {
                    if (subStr.length() > longestPalindromeLength) {
                        longestPalindromeLength = subStr.length();
                        longestPalin = subStr;
                    }
                };
                
            }
        }
        return longestPalin;
    }   
    
    public boolean isPalindrome(String s) {
        for (int x = 0; x < s.length()/2; x++){
            if (s.charAt(x) != s.charAt(s.length() - x - 1)){
                return false;
            }
        }
        return true;
    }
}
