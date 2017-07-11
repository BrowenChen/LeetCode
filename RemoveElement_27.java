public class Solution {
    public int removeElement(int[] nums, int val) {
        int displacement = 0;
        if (nums.length == 0) {
            return 0;
        }
        int firstNum = nums[0];
        
        if (firstNum == val) {
            displacement += 1;            
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                displacement += 1;
            } else {
                nums[i-displacement] = nums[i];
            }
        }
        
        return nums.length - displacement;
    }
}
