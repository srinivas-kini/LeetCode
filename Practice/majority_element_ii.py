# https://leetcode.com/problems/majority-element-ii/submissions/
class Solution(object):
    def majorityElement(self, nums):
        if len(nums) == 1:
            return nums
        ret = set()
        freq = len(nums) // 3
        for num in nums:
            if num not in ret and nums.count(num) > freq:
                ret.add(num)
        return list(ret)
        
