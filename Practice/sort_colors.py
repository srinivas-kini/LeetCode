# https://leetcode.com/problems/sort-colors/
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        zeroes = nums.count(0)
        ones = nums.count(1)
        twos = nums.count(2)
        j = 0 
        nums.clear()
        for count in [zeroes,ones,twos]:
            for i in range(count):
                nums.append(j)
            j += 1
