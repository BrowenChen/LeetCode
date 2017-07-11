public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else {
            String numString = String.valueOf(x);
          
            for (int i = 0; i < numString.length() / 2; i++) {
                if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
