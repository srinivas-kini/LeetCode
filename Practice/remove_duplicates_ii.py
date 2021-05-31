# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution:
    def removeDuplicates(self, nums):
        memo = {num: nums.count(num) - 2 for num in nums if nums.count(num) > 2}
        for num in memo:
            for _ in range(memo[num]):
                nums.remove(num)
        return len(nums)
