public class Solution {
    public int search(int[] nums, int target) {
        // Binary search.
        int start = 0;
        int end = nums.length-1;
        int mid;
        
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        
        while (start < end) {
            mid = (start+end)/2;
            if (target < nums[mid]) {
                if ( target >= nums[start] ) {              
                    end = mid-1;
                } 
                else if (nums[mid] <= nums[end]) {
                    end = mid-1;
                }                
                else {
                    start = mid+1;
                }
            } else if (target > nums[mid]) {
                if (target < nums[start]) {
                	start = mid+1;
                } else if (nums[mid] >= nums[start]) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            } else if (target == nums[mid]) {
                return mid;
            } else {
                return -1;
            }          
        }
        
        if (start == end) {
            if (nums[start] == target) {
                return start;
            }
        }
        return -1;
    }
}
