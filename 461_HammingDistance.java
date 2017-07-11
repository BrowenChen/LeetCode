public class Solution {
    public int hammingDistance(int x, int y) {
        String xBits = Integer.toBinaryString(x);
        String yBits = Integer.toBinaryString(y);
        // System.out.println(xBits);
        // System.out.println(yBits);        
        int hamDist = 0;
        boolean foundDiff = false;
        
        if (x == y) {
            return hamDist;
        }
        
        if (xBits.length() > yBits.length()) {
            for (int i = 0; i < xBits.length(); i++) {
                char xCur = xBits.charAt(xBits.length() - 1 - i);
                char yCur = new Character('0');
                if (i < yBits.length()) {
                    yCur = yBits.charAt(yBits.length()-1-i);
                }
                
                if (xCur != yCur) {
                    hamDist += 1;
                }
            }
        } else {
            for (int i = 0; i < yBits.length(); i++) {
                char yCur = yBits.charAt(yBits.length() - 1 - i);
                char xCur = new Character('0');
                if (i < xBits.length()) {
                    xCur = xBits.charAt(xBits.length() - 1 - i);
                }
                
                if (xCur != yCur) {
                    hamDist += 1;
                }
            }            
            
        }
        
        return hamDist;
        
        
    }
}
