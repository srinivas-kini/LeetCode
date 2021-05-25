# https://leetcode.com/problems/arithmetic-slices/
class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        if len(nums) <= 2:
            return 0
        seqs = 0
        for i in range(len(nums) - 1):
            curr, j = nums[i], i + 1
            nxt = nums[j]
            diff = nxt - curr
            count = 2 # min sequence of length 2 will always exist
            while j < len(nums) - 1:
                curr = nxt
                nxt = nums[j + 1]
                if nxt - curr == diff:
                    count += 1
                    if count >= 3:
                        seqs += 1
                else:
                    break
                j += 1
        return seqs
