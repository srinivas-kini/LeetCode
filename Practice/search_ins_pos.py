# https://leetcode.com/problems/search-insert-position/
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if not nums:
            return -1
        
        left, right = 0, len(nums) - 1
        
        while left <= right:
            
            mid = (left + right) // 2 # find the middle
            # print(mid)
            
            if nums[mid] == target:
                return mid
            
            elif nums[mid] > target: # search the right half
                right = mid - 1
            
            else: # search the left right 
                left = mid + 1
        
        
        return left
        
