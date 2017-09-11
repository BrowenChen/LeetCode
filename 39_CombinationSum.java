class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> tempSet = new ArrayList<Integer>();
        backtracking(result, candidates, tempSet, target, 0);
        return result;
    }
    
    private void backtracking(List<List<Integer>> result, int[] candidates, List<Integer> tempSet, int target, int startIdx) {
        if (target < 0) return;
        else if (target == 0) {
            result.add(new ArrayList<Integer>(tempSet));
        } else {
            for (int i = startIdx; i < candidates.length; i++) {
                int curNum = candidates[i];
                tempSet.add(curNum);
                backtracking(result, candidates, tempSet, target - curNum, i);
                tempSet.remove(tempSet.size() - 1);
            }     
        }      
    }
}
