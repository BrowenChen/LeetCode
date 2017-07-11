public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int curMax = nums[0];
        int start = 0;
        int end = 0;
        
        for (int i = 1; i < nums.length; i++) {
            int curVal = curMax + nums[i];
            if (nums[i] > curVal) {
                curMax = nums[i];
                if (curMax > maxSoFar) {
                    maxSoFar = curMax;
                    start = i;
                    end = i;
                }
            } else if (curVal > maxSoFar) {
                curMax = curVal;
                maxSoFar = curMax;
                end = i;
            } else {
                curMax = curVal;
            }
        }
        return maxSoFar;
    }
}
