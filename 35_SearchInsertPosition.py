class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        idx = 0
        for num in nums:
            if num == target:
                return idx
            elif target <= num:
                return idx
            else:
                idx = idx + 1

        return idx
