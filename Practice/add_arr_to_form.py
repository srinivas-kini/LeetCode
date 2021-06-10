# https://leetcode.com/problems/add-to-array-form-of-integer/
class Solution:
    def addToArrayForm(self, nums: List[int], k: int) -> List[int]:
        numsum = 0
        multiplier = 10 ** (len(nums) - 1)  # 1,2,3,4
        for num in nums:
            numsum += num * multiplier
            multiplier //= 10
        return [int(c) for c in str(numsum + k)]
