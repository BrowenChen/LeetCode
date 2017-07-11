public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String longestPrefix = strs[0];
        for (String st : strs) {
            if (st.equals("")) {
                return "";
            }
            if (st.length() < longestPrefix.length()) {
                longestPrefix = longestPrefix.substring(0, st.length());
            }
            
            String prefix = st.substring(0, longestPrefix.length());
            
            while (!prefix.equals(longestPrefix)) {
                if (longestPrefix.length() == 0) {
                    return "";
                }
                longestPrefix = longestPrefix.substring(0, longestPrefix.length()-1);
                prefix = st.substring(0, longestPrefix.length());
            }
            
        }
        return longestPrefix;
    }
}
