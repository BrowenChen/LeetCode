import java.util.Arrays;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> hashBucket = new HashMap<String, List<String>>();
        
        for (String s : strs) {
            char[] char1 = s.toLowerCase().toCharArray();
            Arrays.sort(char1);
            String s1 = new String(char1);
            List<String> anagrams;
            if (!hashBucket.containsKey(s1)) {
				anagrams = new ArrayList<String>();
            } else {
				anagrams = hashBucket.get(s1);                
            }
			anagrams.add(s);
			hashBucket.put(s1, anagrams);            
        }
        
        for (String key : hashBucket.keySet()) {
            res.add(hashBucket.get(key));
        }
        return res;
        
    }
}
