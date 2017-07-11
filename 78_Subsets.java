public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // Empty list
        result.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        
        for (int num : nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            for (List<Integer> i : result) {
                List<Integer> newList = i;
                newList.add(num);
                res.add(newList);
            }            
            result.addAll(res);
        }
        
        return result;
    }
}

