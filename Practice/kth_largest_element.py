# https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
class Solution(object):
    def findKthLargest(self, nums, k):
        nums = sorted(nums, reverse=True)
        if k == 1:
            return nums[0]
        size = len(nums)
        if k == size:
            return nums[-1]
        curr_index = 1
        curr_elem = nums[0]
        i = 1
        tmp = 0
        while i < k:
            if tmp == size - 1:
                break
            for j in range(curr_index, size):
                if j == size - 1:
                    tmp = j
                if nums[j] != curr_elem or curr_index == size - 1:
                    curr_index = j
                    curr_elem = nums[i]
                    i += 1
                    break
        return curr_elem