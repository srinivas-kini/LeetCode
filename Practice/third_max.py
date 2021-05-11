# https://leetcode.com/problems/third-maximum-number/submissions/
class Solution(object):
    def thirdMax(self, nums):
        if len(nums) == 1:
            return nums[0]
        if len(nums) == 2:
            return nums[0] if nums[0] > nums[1] else nums[1]
        x = list(sorted(set(nums), reverse=True))
        if len(x) == 1:
            return x[0]
        if len(x) == 2:
            return x[0] if x[0] > x[1] else x[1]
        return x[2]
