# https://leetcode.com/problems/two-sum/
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        complements = {}
        for i,n in enumerate(nums):
            if target - n in complements:
                return [i,complements[target - n]]
            complements[n] = i
            
                
