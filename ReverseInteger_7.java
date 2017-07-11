public class Solution {
    public int reverse(int x) {
        String numString = String.valueOf(x);
        String newString = "";

        if ( x > 0 ) {
            for (int i = numString.length() - 1; i >= 0; i--) {
                newString += numString.charAt(i);
            }
        } else if ( x < 0) {
            // Add the negative.
            newString += numString.charAt(0);
             for (int i = numString.length() - 1; i > 0; i--) {
                newString += numString.charAt(i);
            }
        } else {
            newString += "0";
        }
        
        try {
            return Integer.parseInt(newString);            
        } catch (Exception e) {
            return 0;
        }
    }
}
