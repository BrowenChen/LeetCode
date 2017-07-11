public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longestSoFar = "";
        String currentLongest = "";
        String charactersSeen = ""; 

        for (int i = 0; i < s.length(); i++) {
            String cur = Character.toString(s.charAt(i));
            
            if ( charactersSeen.indexOf(cur) == -1 ){
                charactersSeen += cur;
                currentLongest += cur;
                if (currentLongest.length() >= longestSoFar.length()) {
                    longestSoFar = currentLongest;    
                }
            } else {
                String subStringWithoutRepeat = currentLongest.substring(currentLongest.indexOf(cur)+1);
                currentLongest = subStringWithoutRepeat + cur;
                charactersSeen = subStringWithoutRepeat + cur;
            }
            
            // System.out.println(" cur Longest " + currentLongest);
        }
        
        return longestSoFar.length();
    }
}
