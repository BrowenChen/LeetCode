public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (nums.length==1) {
            List<Integer> single = new ArrayList<Integer>();
            single.add(nums[0]);
            result.add(single);
            return result;
        }
        
        for (int i : nums) {
            List<Integer> firstNum = new ArrayList<Integer>();
            firstNum.add(i);
            List<Integer> restNum = new ArrayList<Integer>();
            
            for (int j : nums) {
                if (i != j) {
                    restNum.add(j);
                }
            }
                        
            int[] restNo = restNum.stream().mapToInt(Integer::intValue).toArray();
            List<List<Integer>> restPermute = permute(restNo);
            
            for (int j = 0; j < restPermute.size(); j++) {
                List<Integer> li = restPermute.get(j);
                List<Integer> full = new ArrayList<Integer>();
                full.addAll(firstNum);
                full.addAll(li);
                result.add(full);
            }
        }
        
        return result;
        
    }
}
