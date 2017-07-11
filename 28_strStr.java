public class Solution {
    public int strStr(String haystack, String needle) {
        
        if (haystack.equals("")) {
            if (needle.equals("")) {
                return 0;
            } else {
                return -1;
            }
        }
        
        if (haystack.equals(needle)) {
            return 0;
        }
        
        if (needle.equals("")) {
            return 0;
        }
        int lenNeedle = needle.length();
        
        for (int i = 0; i <= haystack.length() - lenNeedle; i++) {
            String curWindow = haystack.substring(i, i+lenNeedle);
            if (curWindow.equals(needle)) {
                return i;
            }
        }
        
        return -1;
        
    }
}
