public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        HashMap hm = new HashMap();
        hm.put(")", "(");        
        hm.put("}", "{");
        hm.put("]", "[");
        Stack stack = new Stack();
        stack.push(Character.toString(s.charAt(0)));
        
        for (int i = 1; i < s.length(); i++) {
            if (hm.containsKey(Character.toString(s.charAt(i)))) {
                if (stack.isEmpty()) {
                    return false;
                } 
                String left = (String) hm.get(Character.toString(s.charAt(i)));
                if (!stack.peek().equals(left)) {
                    return false;
                }
                
                stack.pop();
            } else {
                stack.push(Character.toString(s.charAt(i)));
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
