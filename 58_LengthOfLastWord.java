public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] stringArray = s.split("\\s+");
        
        if (stringArray.length == 0) {
            return 0;
        }
        String lastWord = stringArray[stringArray.length-1];
        return lastWord.length();
    }
}
