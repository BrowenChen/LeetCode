public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, List<String>> numberLetters = numLettersHash();
        List<String> result = new ArrayList<String>();
        
        if (digits.length() == 1) {
            return numberLetters.get(Integer.parseInt(digits));
        } else if (digits.length() == 0){
           return result; 
        } else {
            List<String> firstLetter = letterCombinations(Character.toString(digits.charAt(0)));
            List<String> rest = letterCombinations(digits.substring(1));
            for (String i : firstLetter) {
                for (String j : rest) {
                    result.add(i+j);
                }
            }
            return result;
        }
    }
    
    private HashMap<Integer, List<String>> numLettersHash() {
        HashMap<Integer, List<String>> numberLetters = new HashMap<Integer, List<String>>();
        String allLetters = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        
        for (int i = 2; i < 10; i++) {
            List<String> curDig = new ArrayList<String>();
            
            if (i == 7 || i == 9) {
                for (int j = 0; j < 4; j++) {
                    curDig.add(Character.toString(allLetters.charAt(index)));
                    index++;
                }
            } else {
                for (int h = 0; h < 3; h++) {
                    curDig.add(Character.toString(allLetters.charAt(index)));
                    index++;                    
                }
            }
            numberLetters.put(i, curDig);
        }       
        return numberLetters;
    }
}
