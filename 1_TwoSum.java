public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSum = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        int lowerIndex = 0;
        int higherIndex = 0;
        
        // Check if length of nums is 2
        
        if (nums.length == 2) {
            if ((nums[0] + nums[1]) == target ) {
                lowerIndex = 0;
                higherIndex = 1;
            }
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                
                // Check if current number requires a duplicate of that number to achieve target
                if ((target - nums[i]) == nums[i]) {
                    int possibleLowerIdx = i;
                    for (int k = i+1; k<nums.length; k++) {
                        if (nums[k] == (target - nums[i])) {
                            lowerIndex = possibleLowerIdx;
                            higherIndex = k;
                            break;
                        }
                    }
                }
                else {
                    twoSum.put(nums[i], target-nums[i]);
                    if (twoSum.containsKey(target-nums[i]) && (target-nums[i] != nums[i])) {
                        
                        int lowIndex = 0;
                        // Find Lower Index
                        for (int j = 0; j < nums.length; j++) {
                            if (nums[j] == (target-nums[i])) {
                                lowIndex = j;
                            }
                        }
                        
                        if (i != lowIndex) {
                            lowerIndex = lowIndex;
                            higherIndex = i;
                        }
                        higherIndex = i;
                    }
                }
            }
    
        }
        ans[0] = lowerIndex;
        ans[1] = higherIndex;
        
        return ans;
        
    }
}
